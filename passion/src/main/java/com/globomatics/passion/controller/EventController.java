package com.globomatics.passion.controller;


import com.globomatics.passion.model.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {



    @RequestMapping( value = "/api/v1/event/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Event> getEvent(@PathVariable("id") long id) {
        ResponseEntity<Event> response = null;
        response = new ResponseEntity<>(new Event(), HttpStatus.OK);
        return  response;
    }


}

