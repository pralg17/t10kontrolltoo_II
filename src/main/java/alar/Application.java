package alar;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AASA on 20.04.2017.
 */
@RestController
@SpringBootApplication
public class Application {
    @RequestMapping("/")
    public String start(){
        return "Hello";
    }
}
