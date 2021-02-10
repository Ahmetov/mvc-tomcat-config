package org.example.model;

import java.time.LocalDate;

public class OperationModel {
    Double result;
    LocalDate date;

    public OperationModel(Double result, LocalDate date) {
        this.result = result;
        this.date = date;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
