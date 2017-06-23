package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ticketsapp.service.EventService;
import ticketsapp.domain.Order;


@Controller
public class OrderController {

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }


    @RequestMapping("/order/event")
    public String getProductById(@RequestParam("id") Long eventId, Model model) {
        model.addAttribute("actualEvent", eventService.getEventById(eventId));

        Order order = new Order();
        model.addAttribute("newOrder", order);
        return "order";
    }

    @RequestMapping(value = "/order/event", method = RequestMethod.POST)
    public String executeOrder(@RequestParam("id") Long id, @ModelAttribute ("newOrder") Order newOrder) {
        eventService.updateTickets(id, newOrder.getNumberOfTickets());
        return "login";
    }
}
