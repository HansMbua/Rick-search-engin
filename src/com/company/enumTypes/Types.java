package com.company.enumTypes;

public enum Types {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
       switch (this){
           case ACOUSTIC:
               return "acoustic";
           case ELECTRIC:
               return "electric";
       }
       return null;
    }
}
