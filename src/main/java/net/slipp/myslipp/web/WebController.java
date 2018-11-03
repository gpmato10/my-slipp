package net.slipp.myslipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/helloworld")
    public String ee() {
        return "welcome";
    }
}
