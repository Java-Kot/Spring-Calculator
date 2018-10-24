package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("index")
public class CalServlet {
    @GetMapping
    public ModelAndView showCal(){
        ModelAndView home = new ModelAndView("index");
        return home;
    }

    @PostMapping
    public String cal(@RequestParam("num") String[] num, @RequestParam("choose") String choose, Model sum){
        double n;
        switch (choose){
            case "Addition(+)":
                n = Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
                break;
            case "Subtraction(-)":
                n = Double.parseDouble(num[0]) - Double.parseDouble(num[1]);
                break;
            case "Multiplication(X)":
                n = Double.parseDouble(num[0]) * Double.parseDouble(num[1]);
                break;
            default:
                n = Double.parseDouble(num[0]) / Double.parseDouble(num[1]);
        }
        sum.addAttribute("n", n);
        return "index";
    }
}
