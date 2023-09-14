package com.example.allocation;

public class AllocationDomainException extends Exception{
    private String exceptionmessage;

    public AllocationDomainException(String exceptionmessage){
        this.exceptionmessage = exceptionmessage;
    }

    public String toString(){
        return exceptionmessage;
    }
}
