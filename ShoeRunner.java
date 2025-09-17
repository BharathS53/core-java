package com.xorkz.abstraction;

public class ShoeRunner {
    public static void main(String[] args){
        Shoe shoe=new SportsShoe();
        shoe.price();
        Shoe shoe1=new FormalShoe();
        shoe1.price();
    }
}
