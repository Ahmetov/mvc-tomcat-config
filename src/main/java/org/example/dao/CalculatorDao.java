package org.example.dao;


import java.util.ArrayList;

public interface CalculatorDao {

    void addResult(double result);

    void removeResult(Double result);

    ArrayList<Double> getHistory();
}
