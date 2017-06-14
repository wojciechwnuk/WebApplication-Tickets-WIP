package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ticketsapp.account.EventService;
import ticketsapp.account.OrderService;
import ticketsapp.domain.Order;

@Controller
public class OrderController {

    private EventService eventService;
    private OrderService orderService;

    public OrderController(EventService eventService, OrderService orderService) {
        this.eventService = eventService;
        this.orderService = orderService;
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
        orderService.sendEmail(newOrder.getDeliveryEmail());
        return "index";
    }

}
