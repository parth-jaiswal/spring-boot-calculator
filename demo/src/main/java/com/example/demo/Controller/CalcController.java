package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @RequestMapping("/")
    public double calc(@RequestParam("num1") String n1, @RequestParam("num2") String n2, @RequestParam("operation") String op) {
        //next steps:
        //make class for request param
        //take json from request
        int result;
        int num1 = Integer.parseInt((n1));
        int num2 = Integer.parseInt((n2));
        switch (op) {
            case "+":
                result = num1+ num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }
}
