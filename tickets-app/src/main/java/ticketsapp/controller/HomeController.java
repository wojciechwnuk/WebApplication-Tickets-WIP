package ticketsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to our TICKETS-SKLEP!");
        model.addAttribute("tagline", "Best TICKETS-SKLEP in web!");
        return "index";
    }

    @RequestMapping("/addEvent")
    public String addEvent(){
        return "addEvent";
    }
}