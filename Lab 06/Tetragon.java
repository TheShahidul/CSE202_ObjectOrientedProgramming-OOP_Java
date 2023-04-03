package com.mycompany.lab;

/**
 *
 * @Shahidul gub
 */
public class Tetragon extends Shape{
    int height, width;
    String shapeName;
    
    Tetragon(String shapeName){
        this.shapeName = shapeName;
    }
    @Override
    void printShape(){
        System.out.println(this.shapeName);
    }
    
    void area(int height){
        int result;
        this.height = height;
        
        result = this.height * this.height;
        System.out.println("Area is : " + result);
    }
    void area(int height, int width){
        int result;
        this.height = height;
        this.width = width;
        
        result = this.height * this.width;
        System.out.println("Area is : " + result);
        
    }
}
