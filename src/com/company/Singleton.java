package com.company;

public class Singleton {
    private static Singleton singleton=null;

    private Singleton(){
        System.out.println("Singleton Constructure.");
    }

    public Singleton getSingleton(){
        if(singleton!=null){
            return singleton;
        }
        return new Singleton();
    }
}

