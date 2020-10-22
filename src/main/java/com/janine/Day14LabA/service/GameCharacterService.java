package com.janine.Day14LabA.service;

import com.janine.Day14LabA.model.GameCharacter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface GameCharacterService {

    Optional<GameCharacter> getCharacterById(Long id);
    Optional<GameCharacter> updateCharacter(GameCharacter newGameCharacter, Long id);
    void saveCharacter(GameCharacter gameCharacter);
    void removeCharacter(Long id);
}
