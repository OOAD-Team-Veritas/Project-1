/*
 * This object contains all the animals in the Zoo
 */
package com.ooadteamveritas.project1;
import java.util.LinkedList;
import java.util.List;

public class Zoo{
    
    //The list of Zoo animals
    public List<Animal> zooAnimlals = new LinkedList<Animal>();
    private Boolean zooOperations;
    
    public Zoo(){
        //Zoo is closed first
        this.zooOperations = false;
    }
    
    //Add animal to the zoo
    public void addAnimal(Animal newAnimal){
        this.zooAnimlals.add(newAnimal);
    }
    
    public void openZoo(){
        this.zooOperations = true;
        System.out.println("Zoo is now open!\n"); 
    }
    
    public void closeZoo(){
        this.zooOperations = false;
        System.out.println("Zoo is now closed!\n"); 
    }
}
