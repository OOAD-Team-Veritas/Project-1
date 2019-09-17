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
    }
    
    //Roll call all animals in zoo
    public void rollCall(){
        System.out.println("Zookeeper " + name + " is now doing roll call!");
    }
    
    //Feed all animals in zoo
    public void feedAnimals(){
        System.out.println("Zookeeper " + name + " is feeding Animals!");
    }
    
    //Exercise all animals in zoo
    public void exerciseAnimals(){
        System.out.println("Zookeeper " + name + " is exercising Animals!");
    }
    
    public void closeZoo(){
        System.out.println("Zookeeper " + name + " is closing the Zoo.");
        workplace.closeZoo();
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
