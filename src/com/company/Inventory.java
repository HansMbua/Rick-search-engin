package com.company;

import java.util.ArrayList;
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
}
