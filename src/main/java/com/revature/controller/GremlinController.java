package com.revature.controller;

import com.revature.model.Gremlin;
import com.revature.model.Topic;
import com.revature.repository.DAO;
import com.revature.repository.GremlinRepository;
import com.revature.service.GremlinService;
import com.revature.util.ConnectionUtility;
import com.revature.driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.javalin.http.Handler;
import org.eclipse.jetty.http.HttpStatus;

import java.util.*;


public class GremlinController {


    private static final Logger logger = LoggerFactory.getLogger(GremlinController.class);

    public GremlinService gremlinService = new GremlinService();

    public Handler getAllGremlins = context -> {
        List<Gremlin> gremlins = new ArrayList<>();
         String topicParam = context.queryParam("name"); // this could be null


        if(topicParam == null){
            gremlins = gremlinService.getAllGremlins();
        }
        else {
            try{
               }catch(IllegalArgumentException e){

                String failureMessage = "{\"success\":false, \"message\":\"" +
                        "Please only use the following topic values: " + Arrays.toString(Topic.values())
                        + "\"}";

                context.status(400).json(failureMessage);
                return;
            }
        }
        context.json(gremlins);
    };

    public Handler updateGremlin = context -> {
        Gremlin gremlin = context.bodyAsClass(Gremlin.class);
        gremlin = gremlinService.updateGremlin(gremlin);

        if(gremlin != null){
            context.status(200).json(gremlin);
        } else{
            context.status(400).result("Could not update the gremlin");
        }
    };

    public Handler setGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);
        gremlinService.createNewGremlin(gremlin);
    };

}
