package com.picolov.example;

public class App {
    public String getGreeting() {
        return "hello pico";
    }

    // Example of suppressing SystemPrintln
    @SuppressWarnings("PMD.SystemPrintln")
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
