package com.example.demo;

import com.example.demo.Model.Player;
import com.example.demo.Repository.PlayerRepository;

import java.util.List;

public class CsvUtilFile {

    public PlayerRepository playerRepository;

    public CsvUtilFile(PlayerRepository playerRepository) {
        this.playerRepository=playerRepository;
    }

    public List<Player> getPlayers(){
        List<Player> list=playerRepository.findAll();
        return list;
    }
}
