package com.revature.service;

import com.revature.model.Gremlin;
import com.revature.model.Topic;
import com.revature.repository.GremlinRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GremlinService {

    private GremlinRepository gremlinRepository;

    public GremlinService(){gremlinRepository = new GremlinRepository();}

    public GremlinService(GremlinRepository gremlinRepository) {this.gremlinRepository = gremlinRepository;}

    public Gremlin createNewGremlin(Gremlin gremlin) {return gremlinRepository.create(gremlin);}

    public List<Gremlin> getAllGremlins() {return gremlinRepository.getAll();}

    public Gremlin createGremlin(Gremlin gremlin){return gremlinRepository.create(gremlin);}

    public Gremlin updateGremlin(Gremlin gremlin){return gremlinRepository.update(gremlin);}


}
