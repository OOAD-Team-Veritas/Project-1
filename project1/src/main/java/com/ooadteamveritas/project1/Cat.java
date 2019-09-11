package com.ooadteamveritas.project1;

public class Cat extends Feline {
    public Cat(String inputName){
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Meeeooow! - said " + name + " the Cat"); 
    }
}
