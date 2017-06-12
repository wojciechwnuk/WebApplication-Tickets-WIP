package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ticketsapp.account.EventService;

@Controller
public class OrderController {

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }


    @RequestMapping("/order/event")
    public String getProductById(@RequestParam("id") Long eventId, Model model) {
      model.addAttribute("order", eventService.getEventById(eventId));
        return "order";
    }

}
