package com.company.enumTypes;

public enum Builder {
    FINDER, MARTIN, GIBSON,COLLINS,OLSON,RYAN,PRS,ANY;

    @Override
    public String toString() {
       switch (this){

           case FINDER :
               return "finder";
           case ANY:
               return "any";
           case PRS:
               return "prs";
           case RYAN:
               return "ryan";
           case OLSON:
               return "olson";


       }
       return null;
    }
}
