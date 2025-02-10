package com.example.web;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FarewellController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/farewell")
    public Farewell farewell(
            @RequestParam(value = "name", defaultValue = "Friend") String name,
            @RequestParam(value = "timeOfDay", defaultValue = "Day") String timeOfDay) {

        String message;

        switch (timeOfDay.toLowerCase()) {
            case "morning":
                message = "Have a great morning, " + name + "!";
                break;
            case "afternoon":
                message = "Enjoy your afternoon, " + name + "!";
                break;
            case "evening":
                message = "Good evening and take care, " + name + "!";
                break;
            default:
                message = "Goodbye, " + name + "!";
        }

        return new Farewell(counter.incrementAndGet(), message, timeOfDay);
    }
}
