package net.patrascan.ccitest.controllers;

import net.patrascan.ccitest.entities.Resp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EntryPoint {
    @GetMapping("/")
    public Resp mainEntry(){
        return new Resp("OK", "Howdy there");
    }
}
