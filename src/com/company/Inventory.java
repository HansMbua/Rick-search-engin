package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private Guitar guitar;
    private List<Guitar> GuiterList;

    public Inventory() {

        GuiterList = new ArrayList<>();
    }
    //addeds guitar object to Inventory
    public void addGuitar(String serialNumber, String builder, String model, String type, String backwood, String topwood, double price){
        //get guiter
     guitar = new Guitar(serialNumber,builder,model,type,backwood,topwood,price);
        //add guiter to inventory
        GuiterList.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        //create guiter1 object
        Guitar guitar1 = new Guitar();

        //loop through list
        for (Iterator i = GuiterList.iterator(); i.hasNext();){
            guitar1 = (Guitar)i.next();
            //compare matching guiter to serial number
            if (guitar.getSerialNumber().equals(serialNumber)){
                return guitar1;
            }
        }

        // return guitar1

        return null;
    }
}
