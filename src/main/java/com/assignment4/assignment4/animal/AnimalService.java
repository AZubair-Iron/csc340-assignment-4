package com.assignment4.assignment4.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    /**
     * Fetch all Animals.
     *
     * @return the list of all Animals.
     */
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    /**
     * Fetch a unique Animal.
     *
     * @param animalId the unique Animal id.
     * @return a unique Animal object.
     */
    public Animal getAnimalById(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    /**
     * Fetch all Animals whose name matches the search term.
     *
     * @param name the search key.
     * @return the list of matching Animal.
     */
    public List<Animal> getAnimalsByName(String name) {
        return animalRepository.findByName(name);
    }

    /**
     * Fetch all Animals whose Species matches the search term.
     *
     * @param species the search key.
     * @return the list of matching Animal.
     */
    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.findBySpecies(species);
    }


    /**
     * Fetch all Animals whose habitat matches the search term.
     *
     * @param habitat the search key.
     * @return the list of matching Animal.
     */
    public List<Animal> getAnimalsByHabitat(String habitat) {
        return animalRepository.findByHabitat(habitat);
    }

    /**
     * Add a new Animal to the database.
     *
     * @param animal the new Animal to add.
     */
    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    /**
     * Update an existing Animal.
     *
     * @param animalId the unique Animal Id.
     * @param animal   the new Animal details.
     */
    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setScienceName(animal.getScienceName());
        existing.setSpecies(animal.getSpecies());
        existing.setHabitat(animal.getHabitat());
        existing.setDescription(animal.getDescription());

        //Technically the 4 lines above are not necessary because the save method merges by default.
        animalRepository.save(existing);
    }


    /**
     * Delete a unique Animal.
     *
     * @param animalId the unique Animal Id.
     */
    public void deleteAnimalById(int animalId) {
        animalRepository.deleteById(animalId);
    }

}
