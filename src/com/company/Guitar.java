package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

public class Guitar extends Instrument{
    private String serialNumber;
    private GuitarSpec spec;
    private double price;


    public Guitar(String serialNumber, GuitarSpec spec, double price) {
        super(serialNumber,price,spec);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpec(GuitarSpec spec){
        this.spec = spec;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", spec=" + spec +
                ", price=" + price +
                '}';
    }
}
