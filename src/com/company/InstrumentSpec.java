package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

public abstract class InstrumentSpec {

    private Wood theWood;
    private Builder theBuilder;
    private Types theTypes;
    private String Model;


    public InstrumentSpec(Wood theWood, Builder theBuilder, Types theTypes, String model) {
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        this.theTypes = theTypes;
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


    public boolean matches(InstrumentSpec otherSpec){

        //get matching objects values
        if ((theBuilder != otherSpec.getTheBuilder()) && (theTypes != otherSpec.getTheTypes()) && (theWood != otherSpec.getTheWood()))
            return false;

        if ((Model!= null) && (!Model.equals("")) && (!Model.equals(otherSpec.getModel().toLowerCase())))
            return false;

        return true;
    }


}
