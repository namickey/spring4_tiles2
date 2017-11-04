package demo.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

    @RequestMapping("/hello/greet")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        System.out.println("greet");
        model.addAttribute("name", name);
        System.out.println(name);
        return "hello/greet";
    }
}
