/*
  There will not be an instance of Pachyderm, this class just adds roam() method
*/
package com.ooadteamveritas.project1;

public abstract class Pachyderm extends Animal{
    
    public Pachyderm(String inputName){
        //Calls Animal's constructor
        super(inputName);
    }
    
    //roam is first defined here
    public void roam(){
        state = "roaming";
        System.out.println(name + " the " + this.animalType + " is " + state);
    }
}