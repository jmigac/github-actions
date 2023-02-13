package hr.ibmix.githubactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Rest Controller
public class SimpleController {

    @Get Mapping
    public String getSimpleContent() {
        return "Dev Minutes";
    }

}
