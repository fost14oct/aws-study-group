package study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/test")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "HOT FIX";
    }
}
