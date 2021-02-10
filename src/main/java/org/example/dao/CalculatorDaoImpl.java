package org.example.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CalculatorDaoImpl implements CalculatorDao{
    private ArrayList<Double> history = new ArrayList<>();

    public void addResult(double result) {
        history.add(result);
    }

    public void removeResult(Double result) {
        history.remove(result);
    }

    public ArrayList<Double> getHistory() {
        return history;
    }
}
