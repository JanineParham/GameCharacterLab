package com.janine.Day14LabA.controller;

import com.janine.Day14LabA.model.GameCharacter;
import com.janine.Day14LabA.service.GameCharacterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class GameCharacterController {

    @Autowired
    GameCharacterServiceImpl gameCharacterService;

    @GetMapping("/get/gamecharacter/{id}")
    public Optional<GameCharacter> getCharacterById(@PathVariable Long id){
        return gameCharacterService.getCharacterById(id);
    }

    @PostMapping("/post/gamecharacter")
    public void saveCharacter(@RequestBody GameCharacter gameCharacter){
        gameCharacterService.saveCharacter(gameCharacter);
    }

    @PutMapping("/put/gamecharacter/{id}")
    public Optional<GameCharacter> updateCharacter(@RequestBody GameCharacter gameCharacter, @PathVariable Long id){
        return gameCharacterService.updateCharacter(gameCharacter, id);
    }

    @DeleteMapping("/delete/gamecharacter/{id}")
    public String removeCharacter(@PathVariable Long id){
        gameCharacterService.removeCharacter(id);
        return "character deleted";
    }
}
