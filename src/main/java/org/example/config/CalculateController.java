package org.example.config;

import org.example.dao.CalculatorDao;
import org.example.dao.CalculatorDaoImpl;
import org.example.model.CalcModel;
import org.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calc")
public class CalculateController {
    @Autowired
    CalculatorService calculatorService;

    @Autowired
    CalculatorDao calculatorDao;

    @GetMapping
    public String calculatorPage(/*@RequestParam(required = false ) Integer result,*/ Model model) {
        //model.addAttribute("result", result);
        model.addAttribute("history", calculatorDao.getHistory());
        return "home/calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute CalcModel calcModel, Model model) {
        double result = calculatorService.calculateByOperation(calcModel);
        model.addAttribute("result", result);
        model.addAttribute("history", calculatorDao.getHistory());
        calculatorDao.addResult(result);
        return "home/calculator";
    }

//    @ModelAttribute("history")
//    public ArrayList<Integer> getHistory() {
//        return calculatorDao.getHistory();
//    }
}
