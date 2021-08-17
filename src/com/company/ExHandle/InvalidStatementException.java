package com.company.ExHandle;

public class InvalidStatementException extends  Exception {

    public InvalidStatementException(String message){

        super(message);

    }
    public InvalidStatementException(String message, Exception ex){

        super(message, ex);

    }

}
