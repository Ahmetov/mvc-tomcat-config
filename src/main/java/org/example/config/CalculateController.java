package org.example.config;

import org.example.dao.CalculatorDao;
import org.example.model.CalcModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calc")
public class CalculateController {
    @Autowired
    CalculatorDao calculatorDao;

    @GetMapping
    public String calculatorPage(@RequestParam(required = false ) Integer result, Model model) {
        model.addAttribute("result", result);
        model.addAttribute("history", calculatorDao.getHistory());
        return "home/calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute CalcModel calcModel, Model model) {
        Integer result = calcModel.getFirstArg() + calcModel.getSecondArg();
        model.addAttribute("result", result);
        calculatorDao.addResult(result);
        return "redirect:/calc";
    }

//    @ModelAttribute("history")
//    public ArrayList<Integer> getHistory() {
//        return calculatorDao.getHistory();
//    }
}
