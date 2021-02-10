package org.example.dao;


import org.example.model.OperationModel;

import java.util.ArrayList;

public interface CalculatorDao {

    void addResult(OperationModel result);

    void removeResult(OperationModel result);

    ArrayList<OperationModel> getHistory();
}
