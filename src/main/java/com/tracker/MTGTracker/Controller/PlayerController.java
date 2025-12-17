package com.tracker.MTGTracker.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/players")
@RestController
public class PlayerController {
    

    //Create a new player
    @PostMapping
    public String createPlayer (@RequestBody String name) {
        return "Player " + name + " created";
    }


}
