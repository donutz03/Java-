// {"id":1,"content":"Hello, World!"}

// http://localhost:8080/greeting?name=User

// {"id":1,"content":"Hello, User!"}

// {
//     "id": 1,
//     "content": "Hello, World!"
// }

package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}

public record Greeting(long id, String content) { }

// java -jar build/libs/gs-rest-service-0.1.0.jar
// java -jar target/gs-rest-service-0.1.0.jar