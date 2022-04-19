package com.company;

public class Cup {

    private String liquidType;
    private double percentFull;

    public Cup (String liquidType,double percentFull) { // Constructors
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }

    public String getLiquidType() {
        return liquidType;
    }


}
