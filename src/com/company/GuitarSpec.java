package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

public class GuitarSpec {

    private Wood theWood;
    private Builder theBuilder;
    private Types theTypes;
    private String Model;

    private int numStrings;

    public GuitarSpec() {
    }

    public GuitarSpec(Wood theWood, Builder theBuilder, Types theTypes, String model, int numStrings) {
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        this.theTypes = theTypes;
        Model = model;
        this.numStrings = numStrings;
    }

    public GuitarSpec(Wood theWood, Builder theBuilder, Types theTypes, String Model) {
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        this.theTypes = theTypes;
        this.Model = Model;
    }

    public GuitarSpec(Wood theWood, Builder theBuilder, String model) {
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        Model = model;
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

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public boolean matches(GuitarSpec searchGuitar){

        //get matching objects values
        if ((theBuilder != searchGuitar.getTheBuilder()) && (theTypes != searchGuitar.getTheTypes()) && (theWood != searchGuitar.getTheWood()))
            return false;

        if ((Model!= null) && (!Model.equals("")) && (!Model.equals(searchGuitar.getModel().toLowerCase())))
            return false;

        return true;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "theWood=" + theWood +
                ", theBuilder=" + theBuilder +
                ", theTypes=" + theTypes +
                ", Model='" + Model + '\'' +
                ", numStrings=" + numStrings +
                '}';
    }
}
