/*
    "In at least one case (probably for the Cats) use a random number generation
    to select from alternative responses to animal actions."

    Requirements mention the need for a randomNumber generator that determines
    what a cat will be doing. Possible actions are (for now):
    1 - roam()
    2 - sleep()
    3 - eat()
    4 - exercise()
*/

package com.ooadteamveritas.project1;
import java.util.Random;

public class Cat extends Feline {
    public Cat(String inputName){
        super(inputName);
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Meeeooow! - said " + name + " the Cat"); 
    }
    
    public void randomBehavior(){
        Random rand = new Random();
        int num = rand.nextInt(4)+1;
        
        switch(num){
            case 1: 
                this.roam();
                break;
            case 2:
                this.sleep();
                break;
            case 3: 
                this.eat();
                break;
            case 4: 
                this.exercise();
                break;
            default: this.sleep();
        }
        //Using this make it clear that its of this object...
        System.out.println(this.name + " the Cat is now" + this.state );
    }
}
