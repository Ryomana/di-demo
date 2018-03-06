package lu.ryo.springframework.didemo.controllers;

import lu.ryo.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
