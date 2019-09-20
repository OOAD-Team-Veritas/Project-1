package com.ooadteamveritas.project1;

public class Rhino extends Pachyderm {
    public Rhino(String inputName){
        super(inputName);
        this.animalType = "Rhino";
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Gruunt! - said " + name + " the Rhino"); 
    }
}