package controllers;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import beans.User;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    User user;

    @RequestMapping("/index")
    public String index (ModelMap model) {
        return "home/index";
    }

    @ModelAttribute("user")
    public User getUser () {
        return user;
    }
}
