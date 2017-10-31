package demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        System.out.println("greeting");
        model.addAttribute("name", name);
        System.out.println(name);
        return "greet";
    }
}