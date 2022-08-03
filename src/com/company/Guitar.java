package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

public class Guitar {
    private String serialNumber,model;
    private Wood theWood;
    private Builder theBuilder;
    private Types theTypes;
    private double price;

    public Guitar() {

    }

    public Guitar(String serialNumber, String model, Wood theWood, Builder theBuilder, Types theTypes, double price) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        this.theTypes = theTypes;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wood getTheWood() {
        return theWood;
    }

    public void setTheWood(Wood theWood) {
        this.theWood = theWood;
    }

    public Builder getTheBuilder() {
        return theBuilder;
    }

    public void setTheBuilder(Builder theBuilder) {
        this.theBuilder = theBuilder;
    }

    public Types getTheTypes() {
        return theTypes;
    }

    public void setTheTypes(Types theTypes) {
        this.theTypes = theTypes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                ", theWood=" + theWood +
                ", theBuilder=" + theBuilder +
                ", theTypes=" + theTypes +
                ", price=" + price +
                '}';
    }
}
