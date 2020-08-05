package com.example.demo;

public class Singleton{

    public static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}