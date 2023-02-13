package hr.ibmix.githubactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping
    public String getSimpleContent() {
        return "Dev Minutes";
    }

}
