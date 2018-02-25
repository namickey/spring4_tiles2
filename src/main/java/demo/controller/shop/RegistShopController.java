package demo.controller.shop;

import org.springframework.beans.factory.annotation.Autowired;
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
public class RegistShopController {

    @RequestMapping(value = "/shop/regist/index", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("registShopForm", new RegistShopForm());
        return "shop/regist";
    }

    @RequestMapping(value = "/shop/regist/regist", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registShopForm") RegistShopForm registShopForm, BindingResult result){
        if (result.hasErrors()){
            return "shop/regist";
        }
        System.out.println("RegistShopController.regist:" + registShopForm.getShopName());

        return "redirect:index";
    }
}
