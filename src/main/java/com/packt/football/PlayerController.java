package com.packt.football;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RequestMapping("/players") 
@RestController
public class PlayerController {
    @GetMapping
    public List<String> listPlayers() {
        return List.of("Ivana ANDRES", "Alexia PUTELLAS");
    }
}

