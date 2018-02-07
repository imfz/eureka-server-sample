package lv.k2611a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        return "Hello ";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
