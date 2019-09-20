package com.ooadteamveritas.project1;

public class Hippo extends Pachyderm {
    public Hippo(String inputName){
        super(inputName);
        this.animalType = "Hippo";
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Snrrrt! - said " + name + " the Hippo"); 
    }
}