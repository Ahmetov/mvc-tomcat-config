package org.example.dao;

import org.example.model.OperationModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CalculatorDaoImpl implements CalculatorDao{
    private ArrayList<OperationModel> history = new ArrayList<>();

    public void addResult(OperationModel result) {
        history.add(result);
    }

    public void removeResult(OperationModel result) {
        history.remove(result);
    }

    public ArrayList<OperationModel> getHistory() {
        return history;
    }
}
