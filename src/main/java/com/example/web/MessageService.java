package com.example.web;


import java.util.List;
import java.util.Random;

/**
 * Service, um zufällige Greetings und Farewells zu erzeugen.
 */
public final class MessageService {

    /** Liste von Begrüßungen. */
    private final List<String> greetings =
            List.of("Hello", "Hi", "Hey", "Greetings");
    /** Liste von Abschiedsgrüßen. */
    private final List<String> farewells =
            List.of("Goodbye", "Bye", "See you", "Take care");
    /** Zufallsgenerator. */
    private final Random random = new Random();

    /**
     * Liefert eine zufällige Begrüßung zurück.
     *
     * @return zufälliger Greeting-Text
     */
    public String randomGreeting() {
        return greetings.get(random.nextInt(greetings.size()));
    }

    /**
     * Liefert eine zufällige Abschiedsnachricht zurück.
     *
     * @return zufälliger Farewell-Text
     */
    public String randomFarewell() {
        return farewells.get(random.nextInt(farewells.size()));
    }
}
