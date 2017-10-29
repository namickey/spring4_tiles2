package demo.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Regist {
    @RequestMapping("/regist")
    public String index(Model model){
        System.out.println("/regist.");
        model.addAttribute("registForm", new RegistForm());
        return "regist";
    }

    @RequestMapping("/regist/regist")
    public String regist(@ModelAttribute("registForm") RegistForm registForm){
        System.out.println("/regist/regist.");
        System.out.println(registForm.getName());
        return "redirect:/regist";
    }
}
