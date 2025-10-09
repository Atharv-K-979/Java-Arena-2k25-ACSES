package com.example.demo.controller;



import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService service;

    @GetMapping("/greet")
    public String sayHello(){
        return "Hi Guys !  " + service.greet();
    }
    @GetMapping("/players")
    public List<Player> getPlayers(){
        return service.getPlayers();
    }

    @PostMapping("/players")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        Player newPlayer = service.addPlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.ACCEPTED);
    }

    @GetMapping("/players/{id}")
    public ResponseEntity<Player> findPlayer(@PathVariable int id){
        Player player = service.findPlayer(id);

        if(player != null){
              return new ResponseEntity<>(player, HttpStatus.OK);
        }

        else return new ResponseEntity<>(player, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable int id){
        service.deletePlayer(id);
    }
}
