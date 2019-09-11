/*
  There will not be an instance of Feline, this class just adds roam() method

*/
package com.ooadteamveritas.project1;

public abstract class Feline extends Animal{
    
    public Feline(String inputName){
        //Calls Animal's constructor
        super(inputName);
    }
    
    public void roam(){
        state = "Roaming";
    }
}
