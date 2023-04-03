package com.mycompany.lab;

/**
 *
 * @Shahidul gub
 */
public class Circle extends Shape{
    final double PI = 3.1416;
//    String shape = "Circle";
    @Override
    void printShape()
    {
        System.out.println("Circle");
    }
    
    void area(double r){
        double result;
        result = PI * r * r;
        System.out.println("Area is : " + result);
    }
}
