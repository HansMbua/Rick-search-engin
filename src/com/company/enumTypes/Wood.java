package com.company.enumTypes;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD,MAHOGANY;

    @Override
    public String toString() {
       switch (this){
           case INDIAN_ROSEWOOD:
               return "indian Rosewood";
           case MAHOGANY:
               return "mahogany";
           case BRAZILIAN_ROSEWOOD:
               return "brazilian_rosewood";
       }

       return  null;
    }
}
