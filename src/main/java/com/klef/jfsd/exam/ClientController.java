package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {
    
    @GetMapping("/greet")
    public String greet(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greeting";
    }
    
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    @GetMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }
    
    @GetMapping("/demo2/{num1}/{num2}")
    public String demo2(@PathVariable("num1") int num1, @PathVariable("num2") int num2, Model model) {
        int subtraction = num1 - num2;
        double division = (num2 != 0) ? (double) num1 / num2 : 0;
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "demo2";
    }
    
    @GetMapping("/productform")
    public String productForm() {
        return "productForm";
    }
    
    @GetMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result);
        return "multiplyNumbers";
    }
    
    @GetMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        String reversedStr1 = new StringBuilder(str1).reverse().toString();
        String reversedStr2 = new StringBuilder(str2).reverse().toString();
        model.addAttribute("reversedStr1", reversedStr1);
        model.addAttribute("reversedStr2", reversedStr2);
        return "reverseStrings";
    }
    
    @GetMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        model.addAttribute("addition", addition);
        model.addAttribute("subtraction", subtraction);
        return "calculate";
    }
}
