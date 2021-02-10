package org.example.service;

import org.example.dao.CalculatorDao;
import org.example.dao.CalculatorDaoImpl;
import org.example.model.CalcModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CalculatorService {
    CalculatorDao calculatorDao;

    @Autowired
    public CalculatorService(CalculatorDaoImpl calculatorDaoImpl) {
        this.calculatorDao = calculatorDaoImpl;
    }


    public Double calculateByOperation(CalcModel calcModel) {
        double result = 0;
        switch (calcModel.getSymbol()) {
            case '+':
                result = calcModel.getFirstArg() + calcModel.getSecondArg();
                break;
            case '*':
                result = calcModel.getFirstArg() * calcModel.getSecondArg();
                break;
            case '-':
                result = calcModel.getFirstArg() - calcModel.getSecondArg();
                break;
            case '/':
                result = calcModel.getFirstArg() / calcModel.getSecondArg();
                break;
        }

        return result;
    }

    public void setTimeOfOperation(CalcModel model) {
        LocalDate date = LocalDate.now();
        model.setOperationTime(date);
    }
}
