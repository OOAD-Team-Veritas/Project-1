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
    //The Keeper's name
    private String name;
    
    //The zoo that he/she works for
    private Zoo workplace;
    
    public ZooKeeper(String name, Zoo workplace){
        this.name = name;
        this.workplace = workplace;
    }
    
    public void openZoo(){
        System.out.println("Zookeeper " + name + " is opening the Zoo!"); 
        workplace.openZoo();
    }
    
    //Wake up all the animals in zoo
    public void wakeUpAnimals(){
        System.out.println("Zookeeper " + name + " is waking up Animals!");
        workplace.zooAnimals.forEach(animal -> animal.wakeup());
    }
    
    //Roll call all animals in zoo
    public void rollCall(){
        System.out.println("Zookeeper " + name + " is now doing roll call!");
        workplace.zooAnimals.forEach(animal -> animal.makeNoise());
    }
    
    //Feed all animals in zoo
    public void feedAnimals(){
        System.out.println("Zookeeper " + name + " is feeding Animals!");
        workplace.zooAnimals.forEach(animal -> animal.eat());
    }
    
    //Exercise all animals in zoo
    public void exerciseAnimals(){
        System.out.println("Zookeeper " + name + " is exercising Animals!");
        workplace.zooAnimals.forEach(animal -> animal.roam());
    }
    
    public void closeZoo(){
        System.out.println("Zookeeper " + name + " is closing the Zoo.");
        workplace.zooAnimals.forEach(animal -> animal.sleep());
        workplace.closeZoo();
    }
    
}
