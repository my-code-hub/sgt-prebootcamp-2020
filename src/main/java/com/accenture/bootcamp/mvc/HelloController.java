package com.accenture.bootcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String hello(@RequestParam String name,
                        Model model) {

        String hello = "My name is " + name;
        model.addAttribute("greeting", hello);
        // we are returning view name
        // and spring will find corresponding
        // view in resources/templates folder
        // (in this case, hello.html)
        return "hello";
    }
}
