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
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Wood.BRAZILIAN_ROSEWOOD,Builder.FINDER,Types.ACOUSTIC,"");

        List<Guitar> guitar1 = inventory.Search(whatErinLikes);


        if (!guitar1.isEmpty()){
            for (Iterator i = guitar1.iterator(); i.hasNext();){
                Guitar guitar3 = (Guitar) i.next();
                System.out.println(guitar3);

            }

        }else{
            System.out.println("sorry we cannot find a match but we found Related specs for you");

        }


    }

    private static void initializeInventory(Inventory inventory) {

        GuitarSpec guitarSpec = new GuitarSpec(Wood.BRAZILIAN_ROSEWOOD,Builder.FINDER,Types.ELECTRIC,"ns29-7");
        Guitar guitar = new Guitar("",guitarSpec,50.0);

        GuitarSpec guitarSpec2 = new GuitarSpec(Wood.MAHOGANY,Builder.FINDER,Types.ELECTRIC,"ns29-7");
        Guitar guitar1 = new Guitar("",guitarSpec2,50.0);


        inventory.addGuitar(guitar);
        inventory.addGuitar(guitar1);

    }


}
