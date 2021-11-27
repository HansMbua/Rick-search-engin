package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        run();
    }

    public static void run(){
        Inventory inventory = new Inventory();
        //add values into object
        inventory.addGuitar("1234","hans","sn-1234","mohoghni","spine","vs",5.50);
        //search guiter with serialNumber
//        Guitar guitar = inventory.getGuitar("1234");
        //costomers search
        Guitar CostomerSpec = new Guitar(" ","james","sn-1234","mohoghni","spine","",5.50);

        Guitar guitar1 = inventory.Search(CostomerSpec);

//        System.out.println("the guiter is : "+ guitar.toString());

        //loop through the list and display the costomers search
          if (guitar1 != null){
              System.out.println("Erin you might like "+guitar1);
          }else {
              System.out.println("sorry Erin we have no match found for you ");
          }


    }
}
