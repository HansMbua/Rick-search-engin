package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        run();
    }

    public static void run() {
        Inventory inventory = new Inventory();

        Guitar guitar = new Guitar("", "sn-12", Wood.BRAZILIAN_ROSEWOOD, Builder.FINDER, Types.ELECTRIC, 0.50);
        Guitar guitar2 = new Guitar("", "sn-12", Wood.INDIAN_ROSEWOOD, Builder.FINDER, Types.ELECTRIC, 0.50);
        Guitar theGuitar = new Guitar("", "", Wood.MAHOGANY, Builder.FINDER, Types.ELECTRIC, 0.50);
        //add values into object
        inventory.addGuitar(guitar);
        inventory.addGuitar(guitar2);
        inventory.addGuitar(theGuitar);
        //search guitar with serialNumber

        Guitar CustomersSpec = new Guitar("", "", Wood.BRAZILIAN_ROSEWOOD, Builder.FINDER, Types.ACOUSTIC, 0.00);

        List<Guitar> guitar1 = inventory.Search(CustomersSpec);


        if (!guitar1.isEmpty()){
            for (Iterator i = guitar1.iterator(); i.hasNext();){
                Guitar guitar3 = (Guitar) i.next();
                System.out.println(guitar3);

            }

        }else{
            System.out.println("sorry we cannot find a match");
        }


    }
}
