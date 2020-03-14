package com.example.targetechgroup.model;
import javax.validation.constraints.NotBlank;


public  class OperationRequest {
    @NotBlank(message = "number1 type can't be empty!")
    String number1;
    @NotBlank(message = "number2 type can't be empty!")
    String number2;
    @NotBlank(message = "operation type can't be empty!")
    String operation;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

