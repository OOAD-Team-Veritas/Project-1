/*
  There will not be an instance of Canine, this class just adds roam() method

*/
package com.ooadteamveritas.project1;

public abstract class Canine extends Animal{
    
    public Canine(String inputName){
        //Calls Animal's constructor
        super(inputName);
    }
    
    public void roam(){
        state = "trotting";
        System.out.println(name + " the Canine is " + state);
    }
}