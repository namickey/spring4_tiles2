package demo.controller.shop;

import demo.service.ShopService;
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

    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("registShopForm", new RegistShopForm());
        return "regist";
    }

    @RequestMapping(value = "/regist", params = "ge", method = RequestMethod.POST)
    public String regist(@Valid @ModelAttribute("registShopForm") RegistShopForm registShopForm, BindingResult result, Model model){
        if (result.hasErrors()){
            return "regist";
        }
        System.out.println("RegistShopController.regist:" + registShopForm.getShopName());
        shopService.regist(registShopForm.getShopName());
        return "redirect:/regist";
    }
}
