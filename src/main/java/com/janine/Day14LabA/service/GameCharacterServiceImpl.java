package com.janine.Day14LabA.service;

import com.janine.Day14LabA.model.GameCharacter;
import com.janine.Day14LabA.repo.GameCharacterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameCharacterServiceImpl implements GameCharacterService {

    @Autowired
    GameCharacterRepo gameCharacterRepo;

    @Override
    public Optional<GameCharacter> getCharacterById(Long id) {
        return gameCharacterRepo.findById(id);
    }

    @Override
    public Optional<GameCharacter> updateCharacter(GameCharacter newGameCharacter, Long id) {
        gameCharacterRepo.findById(id)
                .map(gameCharacter -> {
                    gameCharacter.setName(newGameCharacter.getName());
                    gameCharacter.setSpecies(newGameCharacter.getSpecies());
                    gameCharacter.setSpecialty(newGameCharacter.getSpecialty());
                    gameCharacter.setWeaponOfChoice(newGameCharacter.getWeaponOfChoice());
                    gameCharacter.setLevel(newGameCharacter.getLevel());
                    gameCharacter.setScore(newGameCharacter.getScore());
                    return gameCharacterRepo.save(gameCharacter);
                });
        return gameCharacterRepo.findById(id);
    }

    @Override
    public void saveCharacter(GameCharacter gameCharacter) {
        gameCharacterRepo.save(gameCharacter);
    }

    @Override
    public void removeCharacter(Long id) {
        gameCharacterRepo.deleteById(id);
    }
}
