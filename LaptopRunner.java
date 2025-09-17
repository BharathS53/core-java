package com.xorkz.abstraction;

public class LaptopRunner {
    public static void main(String[]  args){
        Laptop laptop=new GamingLaptop();
        laptop.performance();
        Laptop laptop1=new BasicLaptop();
        laptop1.performance();
    }
}
