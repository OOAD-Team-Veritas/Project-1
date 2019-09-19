package com.ooadteamveritas.project1;

public class Hippo extends Pachyderm {
    public Hippo(String inputName){
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Snrrrt! - said " + name + " the Hippo"); 
    }
}