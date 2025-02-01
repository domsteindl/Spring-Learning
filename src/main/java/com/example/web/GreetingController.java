package com.example.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller für Greeting-Endpunkte.
 */
@RestController
public final  class GreetingController {
    /** Template für die Begrüßung. */
    private static final String TEMPLATE = "Hello, %s!";
    /** Zähler für eindeutige IDs. */
    private final AtomicLong counter = new AtomicLong();
    /**
     * Liefert ein Greeting-Objekt zurück.
     *
     * @param name Name der Person, standardmäßig "World"
     * @return Greeting mit ID und Begrüßungstext
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",
            defaultValue = "World")
             final String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }

    /**
     * Liefert ein personalisiertes Greeting zurück.
     *
     * @param name Name der Person
     * @param age  Alter der Person
     * @return Greeting mit personalisiertem Text
     */
    @GetMapping("/greeting/personal")
    public Greeting personalGreeting(@RequestParam final String name,
                                     @RequestParam final int age) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Hi %s, you are %d!", name, age));
    }
}
