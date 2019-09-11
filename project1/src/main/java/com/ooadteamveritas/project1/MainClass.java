/*
This is the test class that contains the main() function for our testing
*/
package com.ooadteamveritas.project1;

class MainClass 
{ 
    public static void main(String args[]) 
    { 
        Tiger sam = new Tiger("Sam");
        Cat tom = new Cat("Tom");
        Lion mufasa = new Lion("Mufasa");
        sam.makeNoise();
        tom.makeNoise();
        mufasa.makeNoise();
        
        //Test cat random behavior
        for (int i = 0; i < 5; i++) {
            tom.randomBehavior();
        }
    } 
} 
