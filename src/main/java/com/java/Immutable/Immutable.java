package com.java.Immutable;
 final public class Immutable {
    private final String pancardNumber;
    Immutable(String pancardNumber){
        this.pancardNumber = pancardNumber;
    }

    public String validatePanCardNumber(String panCardNumber){
        if(panCardNumber==this.pancardNumber){
            return panCardNumber;
        }else{
            return new String(panCardNumber);
        }
    }
}
