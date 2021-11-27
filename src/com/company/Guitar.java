package com.company;

public class Guitar {
    private String serialNumber,builder,model,type,backwood,topwood;
    private double price;

    public Guitar() {

    }

    public Guitar(String serialNumber, String builder, String model, String type, String backwood, String topwood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackwood() {
        return backwood;
    }

    public void setBackwood(String backwood) {
        this.backwood = backwood;
    }

    public String getTopwood() {
        return topwood;
    }

    public void setTopwood(String topwood) {
        this.topwood = topwood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guitar available {" +
                "serialNumber='" + serialNumber + '\'' +
                ", builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", backwood='" + backwood + '\'' +
                ", topwood='" + topwood + '\'' +
                ", price=" + price +
                '}';
    }
}
