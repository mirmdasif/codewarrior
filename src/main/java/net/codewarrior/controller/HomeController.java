package net.codewarrior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author manuel
 * @since 0.0.1
 */
@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        return "home/show";
    }
}
