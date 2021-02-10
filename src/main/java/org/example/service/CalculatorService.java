package org.example.service;

import org.example.dao.CalculatorDao;
import org.example.dao.CalculatorDaoImpl;
import org.example.model.CalcModel;
import org.example.model.OperationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public OperationModel setResultResponse(Double result) {
        LocalDateTime date = LocalDateTime.now();

        return new OperationModel(result, date);
    }
}
