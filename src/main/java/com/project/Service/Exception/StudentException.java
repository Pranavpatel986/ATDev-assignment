package com.project.Service.Exception;

public class StudentException extends RuntimeException {
    public StudentException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public StudentException(String exMessage) {
        super(exMessage);
    }
}
