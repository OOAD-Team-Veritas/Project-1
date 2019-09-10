package com.ooadteamveritas.project1;

public class Feline extends Animal{
    public Feline(String inputName){
        //Call's Animal's constructor
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Meeeooow!"); 
    }
}
