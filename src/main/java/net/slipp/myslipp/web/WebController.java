package net.slipp.myslipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/helloworld")
    public String welcome(String name, int age, Model model) {
        System.out.println("name : " + name + " age : " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "welcome";
    }
}
