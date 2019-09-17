/*
 * ZooKeeper responsibilities:
 * 1 - Wake up animals
 * 2 - Roll call animals
 * 3 - Feed animals
 * 4 - Excercise animals
 * 5 - Shutdown zoo
 * 
 */
package com.ooadteamveritas.project1;

public class ZooKeeper {
    private String name;
    
    public ZooKeeper(String name){
        this.name = name;
    }
    
    public void openZoo(){
        System.out.println("Zookeer " + name + " is opening the Zoo!\n"); 
    }
    
    //Wake up all the animals in zoo
    public void wakeUpAnimals(){
        System.out.println("Zookeer " + name + " is waking up Animals!\n");
    }
    
    //Roll call all animals in zoo
    public void rollCall(){
        System.out.println("Zookeer " + name + " is now doing roll call!\n");
    }
    
    //Feed all animals in zoo
    public void feedAnimals(){
        System.out.println("Zookeer " + name + " is feeding Animals!\n");
    }
    
    //Exercise all animals in zoo
    public void exerciseAnimals(){
        System.out.println("Zookeer " + name + " is exercising Animals!\n");
    }
    
    public void closeZoo(){
        System.out.println("Zookeer " + name + " is closing the Zoo.\n");
    }
    
    //Wake up individual animal
    private void wakeUp(){}

    //Roll call individual animal
    private void call(){}

    //Feed individual animal
    private void feed(){}

    //Excercise individual animal
    private void excercise(){}
}
