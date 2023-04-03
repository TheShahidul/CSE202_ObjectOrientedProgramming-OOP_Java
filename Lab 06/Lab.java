package com.mycompany.lab;

/**
 *
 * @author gub
 */

public class Lab {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.printShape();
        circle1.area(5);
        
        Tetragon t1 = new Tetragon("Square");
        t1.printShape();
        t1.area(5);
        
        Tetragon t2 = new Tetragon("Rectangle");
        t2.printShape();
        t2.area(12,5);
    }
}
