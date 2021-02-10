package org.example.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CalculatorDao {
    private ArrayList<Integer> history = new ArrayList<>();

    public void addResult(Integer result) {
        history.add(result);
    }

    public void removeResult(Double result) {
        history.remove(result);
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }
}
