package com.revature;

import com.revature.controller.GremlinController;
import com.revature.model.Gremlin;
import com.revature.model.Topic;
import com.revature.model.Role;
import com.revature.repository.GremlinRepository;
import com.revature.repository.DAO;
import com.revature.util.ConnectionUtility;
import com.revature.service.GremlinService;
import io.javalin.Javalin;
import io.javalin.http.HandlerType;
import org.eclipse.jetty.http.HttpMethod;
import org.postgresql.Driver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class driver {
    static Logger logger = LoggerFactory.getLogger(Driver.class);
    public static void main(String[] args){

        GremlinController gremlinController = new GremlinController();
        Javalin app = Javalin.create().start(8080);
        app.get("/", context -> context.result("Welcome to the GremlinAPI"));

        app.get("/gremlins", gremlinController.getAllGremlins);
        app.post("/gremlins", gremlinController.setGremlin);
        app.put("/gremlins", gremlinController.updateGremlin);


    }
}
