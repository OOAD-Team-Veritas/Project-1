/*
This is the test class that contains the main() function for our testing
*/
package com.ooadteamveritas.project1;

import java.io.FileNotFoundException;
import java.io.PrintStream;

class MainClass 
{ 
    public static void main(String args[]) throws FileNotFoundException 
    { 
        // Save original out stream.
        PrintStream originalOut = System.out;
        // Save original err stream.
        PrintStream originalErr = System.err;

        // Create a new file output stream.
        PrintStream fileOut = new PrintStream("./out.txt");
        // Create a new file error stream. 
        PrintStream fileErr = new PrintStream("./err.txt");

        // Redirect standard out to file.
        System.setOut(fileOut);
        // Redirect standard err to file.
        System.setErr(fileErr);
        //Set up our Zoo
        Zoo theOOPZoo = new Zoo();
        
        //Fill up Zoo with animals
        theOOPZoo.addAnimal(new Cat("Cory"));
        theOOPZoo.addAnimal(new Cat("Cam"));
        theOOPZoo.addAnimal(new Tiger("Terry"));
        theOOPZoo.addAnimal(new Tiger("Tim"));
        theOOPZoo.addAnimal(new Lion("Lenny"));
        theOOPZoo.addAnimal(new Lion("Lisa"));
        theOOPZoo.addAnimal(new Hippo("Harry"));
        theOOPZoo.addAnimal(new Hippo("Henrietta"));
        theOOPZoo.addAnimal(new Rhino("Ryan"));
        theOOPZoo.addAnimal(new Rhino("Rachel"));
        theOOPZoo.addAnimal(new Elephant("Eli"));
        theOOPZoo.addAnimal(new Elephant("Emmy"));
        theOOPZoo.addAnimal(new Dog("Dougie"));
        theOOPZoo.addAnimal(new Dog("Dante"));
        theOOPZoo.addAnimal(new Wolf("Wolfgang"));
        theOOPZoo.addAnimal(new Wolf("Wren"));


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
