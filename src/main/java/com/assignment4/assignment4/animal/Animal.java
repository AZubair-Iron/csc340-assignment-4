package com.assignment4.assignment4.animal;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;

    @Column(nullable = false)
    private String name;

    private String scienceName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;

    public Animal(int animalId, String name, String scienceName, String species, String habitat, String description) {
        this.animalId = animalId;
        this.name = name;
        this.scienceName = scienceName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal(String name, String scienceName, String species, String habitat, String description) {
        this.name = name;
        this.scienceName = scienceName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal() {
    }

    public int getAnimalId() {
        return this.animalId;
    }

    public String getName() { return this.name; }

    public String getScienceName() { return this.scienceName; }

    public String getSpecies() { return this.species; }

    public String getHabitat() { return this.habitat; }

    public String getDescription() {return this.description; }

    public void setAnimalId(int id) { this.animalId = id; }

    public void setName(String name) { this.name = name; }

    public void setScienceName(String scienceName) { this.scienceName = scienceName; }

    public void setSpecies(String species ) { this.species = species; }

    public void setHabitat(String habitat) {this.habitat = habitat; }

    public void setDescription(String description) { this.description = description;}
    
}
