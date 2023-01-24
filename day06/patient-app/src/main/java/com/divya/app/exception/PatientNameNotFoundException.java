package com.divya.app.exception;

public class PatientNameNotFoundException extends Throwable{
    public PatientNameNotFoundException(String message){
        super(message);
    }
}