package com.ooadteamveritas.project1;

public abstract class Animal{
    protected String name;

    //What the animal is doing right now (kind of like a state machine)
    protected String state;

    public Animal(String inputName){
        name = inputName;
    }

    public String getName(){
        return name;
    }

    public String getState(){
        return state;
    }

    public void wakeup(){
        state = "Awake";
    }

    public void sleep(){
        state = "Sleeping";
    }

    //Used for roll call
    abstract public void makeNoise();
    
    //Zookeeper needs to feed and excercise animals
    public void eat(){
        state = "Eating";
    }
    public void exercise(){
        state = "Exercising";
    }
}
