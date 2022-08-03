package com.company;

import com.company.enumTypes.Builder;
import com.company.enumTypes.Types;
import com.company.enumTypes.Wood;

public class GuitarSpec {

    private Wood theWood;
    private Builder theBuilder;
    private Types theTypes;
    private String Model;

    public GuitarSpec() {
    }

    public GuitarSpec(Wood theWood, Builder theBuilder, Types theTypes,String Model) {
        this.theWood = theWood;
        this.theBuilder = theBuilder;
        this.theTypes = theTypes;
        this.Model = Model;
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

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "theWood=" + theWood +
                ", theBuilder=" + theBuilder +
                ", theTypes=" + theTypes +
                ", Model='" + Model + '\'' +
                '}';
    }
}
