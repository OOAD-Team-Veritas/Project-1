/*
This is the test class that contains the main() function for our testing
*/
package com.ooadteamveritas.project1;

class MainClass 
{ 
    public static void main(String args[]) 
    { 
        //Set up our Zoo
        Zoo theOOPZoo = new Zoo();
        
        //Fill up Zoo with animals
        theOOPZoo.addAnimal(new Cat("Tom"));
        theOOPZoo.addAnimal(new Tiger("Tigger"));
        theOOPZoo.addAnimal(new Lion("Scar"));
        
        //Set up our Zookeeper
        ZooKeeper griffin = new ZooKeeper("Griffin Keyes", theOOPZoo);
        
        //Open the zoo!
        griffin.openZoo();
        
        //Next - the Zookeeper will do his duties
        griffin.wakeUpAnimals();
        griffin.rollCall();
        griffin.feedAnimals();
        griffin.exerciseAnimals();

        //Lastly close the zoo
        griffin.closeZoo();
    } 
} 
