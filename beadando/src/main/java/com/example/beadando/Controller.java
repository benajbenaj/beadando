package com.example.beadando;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    /**
     * This GET http function can be respone to console  whether our cat is old or not
     * Return some little exampe how can i connect with ui
     */
        @GetMapping ("/Cat")
        public String Cat() {
            Cat cat = new Cat(1, "Catica", 11);
            if(cat.isCatOld(cat.getAge()))
                System.out.println("I am too old :(");
            return "<h1>Cat App UI</h2>";
    }
}
