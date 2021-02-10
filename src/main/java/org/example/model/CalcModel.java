package org.example.model;

import java.time.LocalDate;

public class CalcModel {
    Double firstArg;
    Double secondArg;
    char symbol;
    LocalDate operationTime;
    //Operation operation;

    public Double getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(Double firstArg) {
        this.firstArg = firstArg;
    }

    public Double getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(Double secondArg) {
        this.secondArg = secondArg;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public LocalDate getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDate operationTime) {
        this.operationTime = operationTime;
    }
}
