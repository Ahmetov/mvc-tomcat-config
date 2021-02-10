package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OperationModel {
    Double result;
    LocalDateTime operationTime;

    public OperationModel(Double result, LocalDateTime operationTime) {
        this.result = result;
        this.operationTime = operationTime;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public LocalDateTime getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(LocalDateTime operationTime) {
        this.operationTime = operationTime;
    }
}
