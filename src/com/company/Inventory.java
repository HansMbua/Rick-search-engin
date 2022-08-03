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
    public void addGuitar(Guitar guitar){
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

    public List Search(Guitar searchGuitar){
        List guitarList = new LinkedList<>();
        for (Iterator i = GuiterList.listIterator(); i.hasNext(); ) {
            //create guitar object to hold guitars
            Guitar guitar2 = (Guitar) i.next();
            //get matching objects values

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar2.getModel())))
                continue;
            if (searchGuitar.getTheTypes() != guitar2.getTheTypes())
                continue;
            if (searchGuitar.getTheBuilder() != guitar2.getTheBuilder())
                continue;
            if (searchGuitar.getTheWood() != guitar2.getTheWood())
                continue;


            //pass them in a list object
            // return the list object
            guitarList.add(guitar2);
        }

        return guitarList;

    }
}
