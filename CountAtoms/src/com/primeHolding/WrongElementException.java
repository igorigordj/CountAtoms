package com.primeHolding;

public class WrongElementException extends Exception {
    protected String allowedCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ()[]";


    public WrongElementException(String errorMessage) {
        super(errorMessage);


    }


}
