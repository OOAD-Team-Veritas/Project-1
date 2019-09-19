package com.ooadteamveritas.project1;

public class Elephant extends Pachyderm {
    public Elephant(String inputName){
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Truuumpet! - said " + name + " the Elephant"); 
    }
}