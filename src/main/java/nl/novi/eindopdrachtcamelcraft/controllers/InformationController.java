package nl.novi.eindopdrachtcamelcraft.controllers;

import nl.novi.eindopdrachtcamelcraft.services.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/information")
public class InformationController {
    private InformationService informationService;

public InformationController(InformationService informationService){this.informationService=informationService;}

@GetMapping
    public
}
