package com.ooadteamveritas.project1;

public class Lion extends Feline {
    public Lion(String inputName){
        super(inputName);
        this.animalType = "Lion";
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Grraaaauuuu! - said " + name + " the Lion"); 
    }
}