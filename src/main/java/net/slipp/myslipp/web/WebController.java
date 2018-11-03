package net.slipp.myslipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/helloworld")
    public String ee(String name, Model model, int age) {
        System.out.println("name : " + name);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }
}
