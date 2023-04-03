package com.mycompany.lab6;

/**
 *
 * @Shahidul gub
 */

abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    
    abstract void sound();
    
}

class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("Cat says meow!");
    }
    
}


public class Lab6 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sound();
        
        
    }
}