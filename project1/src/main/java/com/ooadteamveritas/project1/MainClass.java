/*
This is the test class that contains the main() function for our testing
*/
package com.ooadteamveritas.project1;

class MainClass 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("This is main in MainClass!\n"); 
        Feline cat = new Feline("Jerry");
        cat.makeNoise();
    } 
} 
