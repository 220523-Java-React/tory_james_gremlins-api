package com.revature.repository;


import com.revature.model.Gremlin;
import com.revature.model.Topic;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin>{

    private List<Gremlin> gremlins;

    public GremlinRepository(){gremlins = new ArrayList<>();}
    public GremlinRepository(List<Gremlin> gremlins){this.gremlins = gremlins;}
    @Override
    public Gremlin create(Gremlin gremlin) {
        if(gremlins.add(gremlin)){
            return gremlin;
        } else {

            return null;
        }
    }

    @Override
    public List<Gremlin> getAll() {

        List<Gremlin> gremlins = new ArrayList<>();

        String sql = "select * from gremlin";


        try(Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet results = stmt.executeQuery();

            while (results.next()) {
                gremlins.add(new Gremlin()

                        .setName(results.getString("name"))
                        .setAge(results.getInt("age"))
                        .setColor(results.getString("color"))
                        .setIsEvil(results.getBoolean("isEvil"))
                );

            }
        }

        catch(SQLException e){
            e.printStackTrace();

        }




            return gremlins;
    }

    @Override
    public Gremlin getById(int id) {
        return null;
    }


    @Override
    public Gremlin update(Gremlin gremlin) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }


}
