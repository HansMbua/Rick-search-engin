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

    public List Search(GuitarSpec searchGuitar){
        List guitarList = new LinkedList<>();
        for (Iterator i = GuiterList.listIterator(); i.hasNext(); ) {
            //create guitar object to hold guitars
            Guitar guitar2 = (Guitar) i.next();
            //get matching objects values
             GuitarSpec guitarSpec = guitar2.getSpec();
            String model = searchGuitar.getModel().toLowerCase();
            if (searchGuitar.getTheBuilder() != guitarSpec.getTheBuilder())
                continue;
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
                continue;
            if (searchGuitar.getTheTypes() != guitarSpec.getTheTypes())
                continue;

            if (searchGuitar.getTheWood() != guitarSpec.getTheWood())
                continue;


            //pass them in a list object
            // return the list object
            guitarList.add(guitar2);
        }

        return guitarList;

    }
}
