package com.revature.model;
import java.io.Serializable;
import java.util.Objects;

public class Gremlin implements Serializable {

    public String name;

    public int age;

    public String color;

    public boolean isEvil;

    public Gremlin(){
        this.name = name;
        this.age = age;
        this.color = color;
        this.isEvil = isEvil;
    }

    public String getName(){return name;}

    public Gremlin setName(){
        this.name = name;
        return this;
    }

    public int getAge(){return age;}

    public Gremlin setAge(){
        this.age = age;
        return this;
    }

    public String getColor(){return color;}

    public Gremlin setColor(){
        this.color = color;
        return this;
    }

    public boolean getIsEvil() {return isEvil;}

    public Gremlin setIsEvil(){
        this.isEvil = isEvil;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gremlin gremlin = (Gremlin) o;
        return  Objects.equals(name, gremlin.name) && Objects.equals(age,gremlin.age) && Objects.equals(color, gremlin.color) && Objects.equals(isEvil, gremlin.isEvil);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, isEvil);
    }

    @Override
    public String toString(){
        return "Gremlin{" +

                "Name = " + name +
                ", Age  = " + age + '\'' +
                ", Color = " + color +
                ", isEvil = " + isEvil +
                "}";
    }


    public Gremlin setName(String name) {
        this.name = name;
        return this;
    }

    public Gremlin setAge(int age) {
        this.age = age;
        return this;
    }


    public Gremlin setColor(String color) {
        this.color = color;
        return this;
    }

    public Gremlin setIsEvil(boolean isEvil) {
        this.isEvil = isEvil;
        return this;
    }

}
