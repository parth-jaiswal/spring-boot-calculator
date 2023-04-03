package com.example.demo.Payload;

public class CalcPayload {
    int num1;
    int num2;
    String operation;

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        return "CalcPayload{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operation='" + operation + '\'' +
                '}';
    }
}
