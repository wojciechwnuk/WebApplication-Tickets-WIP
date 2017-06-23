package ticketsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ticketsapp.service.EventService;
import ticketsapp.domain.Event;


@Controller
public class EventController {

    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/addEvent", method = RequestMethod.GET)
    public String addEvent(Model model) {
        Event event = new Event();
        model.addAttribute("newEvent", event);
        return "addEvent";
    }

    @RequestMapping(value = "/addEvent", method = RequestMethod.POST)
    public String processAddEvent(@ModelAttribute("newEvent") Event eventToBeAdded) {

        eventService.create(eventToBeAdded);
        return "redirect:/";
    }

    @RequestMapping(value = "/event")
    public String getEventById(@RequestParam("id") Long id, Model model) {
        model.addAttribute("event", eventService.getEventById(id));
        return "event";
    }

    @RequestMapping("/")
    public String allEvents(Model model) {

        //eventService.createDefaultEvents();

        model.addAttribute("greeting", "Welcome to our TICKETS-SKLEP!");
        model.addAttribute("tagline", "Best TICKETS-SKLEP in web!");
        model.addAttribute("events", eventService.findAllEvents());
        return "index";
    }

}
