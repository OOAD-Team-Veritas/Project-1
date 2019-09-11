package com.ooadteamveritas.project1;

public class Tiger extends Feline {
    public Tiger(String inputName){
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("RRrrrr! - said " + name + " the Tiger"); 
    }
}
