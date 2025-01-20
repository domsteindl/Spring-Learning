package com.example.web;


import java.util.List;
import java.util.Random;

//Klasse, um Zufällige Greetings und Farewells zu erzeugen
public class MessageService {

    private final List<String> greetings = List.of("Hello", "Hi", "Hey", "Greetings");
    private final List<String> farewells = List.of("Goodbye", "Bye", "See you", "Take care");
    private final Random random = new Random();

    public String randomGreeting() {
        return greetings.get(random.nextInt(greetings.size()));
    }

    public String randomFarewell() {
        return farewells.get(random.nextInt(farewells.size()));
    }
}
