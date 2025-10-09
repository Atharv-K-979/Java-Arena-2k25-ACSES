package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repo;

    public String greet(){
        return "From Service";
    }

    public List<Player> getPlayers() {
        return repo.findAll();
    }

    public Player addPlayer(Player player) {
        return repo.save(player);
    }

    public Player findPlayer(int id) {
        return repo.findById(id).orElse(null);
    }

    public void deletePlayer(int id) {
        repo.deleteById(id);
    }
}
