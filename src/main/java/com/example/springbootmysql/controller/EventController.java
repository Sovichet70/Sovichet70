package com.example.springbootmysql.controller;

import com.example.springbootmysql.model.Event;
import com.example.springbootmysql.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/event")
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addEvent (@RequestParam String title, @RequestParam String description, @RequestParam String date){
        Event event = new Event();
        event.setTitle(title);
        event.setDescription(description);
        event.setDate(date);
        eventRepository.save(event);
        return "Event has been saved.";
    }

    @GetMapping(path = "/list")
    public @ResponseBody Iterable<Event> getList(){
        return eventRepository.findAll();
    }

}
