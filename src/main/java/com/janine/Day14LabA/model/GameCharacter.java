package com.janine.Day14LabA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameCharacter {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String species;
    private String specialty;
    private String weaponOfChoice;
    private int level;
    private int score;

    public GameCharacter(){}

    public GameCharacter(String name, String species, String specialty, String weaponOfChoice, int level, int score) {
        this.name = name;
        this.species = species;
        this.specialty = specialty;
        this.weaponOfChoice = weaponOfChoice;
        this.level = level;
        this.score = score;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getWeaponOfChoice() {
        return weaponOfChoice;
    }

    public void setWeaponOfChoice(String weaponOfChoice) {
        this.weaponOfChoice = weaponOfChoice;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
