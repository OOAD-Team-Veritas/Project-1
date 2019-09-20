package com.ooadteamveritas.project1;

public class Dog extends Canine {
    public Dog(String inputName){
        super(inputName);
        this.animalType = "Dog";
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Woof! - said " + name + " the Dog"); 
    }
}