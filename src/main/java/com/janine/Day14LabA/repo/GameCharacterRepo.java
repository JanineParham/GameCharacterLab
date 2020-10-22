package com.janine.Day14LabA.repo;

import com.janine.Day14LabA.model.GameCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameCharacterRepo extends CrudRepository<GameCharacter, Long> {

}
