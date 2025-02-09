package com.java.Immutable;

import java.util.Objects;

final public class Immutable {
    private final String pancardNumber;
    Immutable(String pancardNumber){
        this.pancardNumber = pancardNumber;
    }

    public String validatePanCardNumber(String panCardNumber){
        if(Objects.equals(panCardNumber, this.pancardNumber)){
            return panCardNumber;
        }else{
            return panCardNumber;
        }
    }
}
