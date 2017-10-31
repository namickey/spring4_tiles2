package demo.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class Regist {
    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String index(Model model){
        System.out.println("/regist.");
        model.addAttribute("registForm", new RegistForm());
        return "regist";
    }

    @RequestMapping(value = "/regist", params = "ge", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registForm") RegistForm registForm, BindingResult result, Model model){
        if (result.hasErrors()){
            System.out.println("Errors happen.");
            System.out.println(result.getFieldError().toString());
            return "regist";
        }
        System.out.println("/regist/regist.");
        System.out.println(registForm.getName());
        return "redirect:/regist";
    }
}
