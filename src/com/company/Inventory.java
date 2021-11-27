package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private LinkedList<Guitar> GuiterList;

    public Inventory() {

        GuiterList = new LinkedList<>();
    }
    //addeds guitar object to Inventory
    public void addGuitar(String serialNumber, String builder, String model, String type, String backwood, String topwood, double price){
        //get guiter
      Guitar guitar = new Guitar(serialNumber,builder,model,type,backwood,topwood,price);
        //add guiter to inventory
        GuiterList.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        //create guiter1 object
        Guitar guitar1;

        //loop through list
        for (Iterator i = GuiterList.iterator(); i.hasNext();){
            guitar1 = (Guitar)i.next();
            //compare matching guiter to serial number
            if (guitar1.getSerialNumber().equals(serialNumber)){
                // return guitar1
                return guitar1;
            }
        }



        return null;
    }

    public Guitar Search(Guitar searchguitar){
        //loop through list
        Guitar guitar2 = new Guitar();
        for (Iterator i = GuiterList.listIterator(); i.hasNext();){
            //create guitar object to hold guitars
            guitar2 = (Guitar) i.next();
            //get matching objacts values
            String builder = searchguitar.getBuilder();
            if ((builder != null) && (builder.equals(" "))&&(!builder.equals(guitar2.getBuilder())) )
                continue;

            String model = searchguitar.getModel();
            if ((model != null) && (model.equals(" "))&&(!model.equals(guitar2.getModel())) )
                continue;


            String type = searchguitar.getType();
            if ((type != null) && (type.equals(" "))&&(!type.equals(guitar2.getType())) )
                continue;


            String backwood = searchguitar.getBackwood();
            if ((backwood != null) && (backwood.equals(" "))&&(!backwood.equals(guitar2.getBackwood())) )
                continue;

            String topWood = searchguitar.getTopwood();
            if ((topWood != null) && (topWood.equals(" "))&&(!topWood.equals(guitar2.getTopwood())) )
                continue;
            //pass them in a list object
            // return the list object
            return guitar2;
        }

        return null;



    }
}
