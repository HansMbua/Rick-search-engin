package com.company;

public class Main {

    public static void main(String[] args) {

        run();
    }

    public static void run(){
        Inventory inventory = new Inventory();
        //add values into object
        inventory.addGuitar("1234","hans","sn-1234","mohoghni","spine","vs",5.50);
        //search guiter with serialNumber
        Guitar guitar = inventory.getGuitar("1234");

        System.out.println("the guiter is : "+ guitar.toString());


    }
}
