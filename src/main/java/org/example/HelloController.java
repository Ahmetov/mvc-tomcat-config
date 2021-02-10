package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @GetMapping("/home")
    public String hello() {
        return "home/home";
    }

    @GetMapping("/bye")
    public String bye() {
        return "home/logout";
    }

    @GetMapping("/list")
    public String listCheck(HttpServletRequest request, Model model) {   //полные данные о http запросе
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        System.out.println(name);
        model.addAttribute("name", name);
        model.addAttribute("lastname", lastname);
        return "home/list";
    }
}
