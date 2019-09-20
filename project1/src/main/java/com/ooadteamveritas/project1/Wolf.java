package com.ooadteamveritas.project1;

public class Wolf extends Canine {
    public Wolf(String inputName){
        super(inputName);
        this.animalType = "Wolf";
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Howwooooo! - said " + name + " the Wolf"); 
    }
}