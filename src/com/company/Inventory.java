package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private LinkedList<Guitar> GuiterList;

    public Inventory() {

        GuiterList = new LinkedList<>();
    }
    //added guitar object to Inventory
    public void addGuitar(Guitar guitar){
        GuiterList.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        //create guiter1 object
        Guitar guitar1;

        //loop through list
        for (Iterator i = GuiterList.iterator(); i.hasNext();){
            guitar1 = (Guitar)i.next();

            //compare matching guider to serial number
            if (guitar1.getSerialNumber().equals(serialNumber)){
                return guitar1;
            }
        }

        return null;
    }

    public List Search(GuitarSpec searchGuitar){
        List<Guitar> matchingGuiters = new LinkedList();
        for (Iterator i = GuiterList.iterator(); i.hasNext(); ) {
            //create guitar object to hold guitars
            Guitar guitar2 = (Guitar) i.next();

          if (searchGuitar.matches(guitar2.getSpec())){
              //pass them in a list object
              // return the list object
              matchingGuiters.add(guitar2);
          }

        }

        return matchingGuiters;

    }
}
