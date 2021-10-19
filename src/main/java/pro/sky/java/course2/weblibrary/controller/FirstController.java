package pro.sky.java.course2.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.weblibrary.service.CounterService;

@RestController
public class FirstController {
    private final CounterService counterService;

    public FirstController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/counter")
    public String showСounter() {
        return "Количество запросов: " + counterService.getRequestCount();
    }


}
