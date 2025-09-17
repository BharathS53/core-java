package com.xorkz.abstraction;

public class PenRunner {
    public static void main(String[] args){
        Pen pen=new BlackPen();
        pen.cost();
        Pen pen1=new BluePen();
        pen1.cost();
    }
}
