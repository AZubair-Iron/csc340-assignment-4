package com.assignment4.assignment4.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService service;

    /**
     * Get a list of all Animals in the database.
     * http://localhost:8080/animals/all
     *
     * @return a list of Animals  objects.
     */
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    /**
     * Get a specific Animal by Id.
     * http://localhost:8080/animals/2
     *
     * @param animalId the unique Id for a Animal.
     * @return One Animal object.
     */
    @GetMapping("/{animalId}")
    public Animal getOneAnimal(@PathVariable int animalId) {
        return service.getAnimalById(animalId);
    }


    /**
     * Get a list of Animals based on their major.
     * http://localhost:8080/animals/species?species="Mammals"
     *
     * @param species the search key.
     * @return A list of Animal objects matching the search key.
     */
    @GetMapping("/species")
    public List<Animal> getAnimalsBySpecies(@RequestParam(name = "species", defaultValue = "humans") String species) {
        return service.getAnimalsBySpecies(species);
    }

    /**
     * Get a list of Animals based on their major.
     * http://localhost:8080/animals/habitat?habitat="home"
     *
     * @param habitat the search key.
     * @return A list of Animal objects matching the search key.
     */
    @GetMapping("habitat")
    public List<Animal> getAnimalsByHabitat(@RequestParam(name = "habitat", defaultValue = "home") String habitat) {
        return service.getAnimalsByHabitat(habitat);
    }

        /**
         * Create a new Animal entry.
         * http://localhost:8080/animals/new --data '{"name": "sample4", "science_name": "scienceName", "species": "species", "habitat": "habitat", "description": "description"}'
         *
         * @param animal the new Animal object.
         * @return the updated list of Animals.
         */
        @PostMapping("/new")
        public List<Animal> addNewAnimal(@RequestBody Animal animal) {
            service.addNewAnimal(animal);
            return service.getAllAnimals();
        }

    /**
     * Update an existing Animal object.getAnimalsByHabitat
     * http://localhost:8080/animals/update/2 --data '{"name": "sample4", "scienceName": "scienceName", "species": "species", "habitat": "habitat", "description": "description"}'
     *
     * @param animalId the unique Animal Id.
     * @param animal   the new update Animal details.
     * @return the updated Animal object.
     */
    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable int animalId, @RequestBody Animal animal) {
        service.updateAnimal(animalId, animal);
        return service.getAnimalById(animalId);
    }

    /**
     * Delete a Animal object.
     * http://localhost:8080/animals/delete/2
     *
     * @param animalId the unique Animal Id.
     * @return the updated list of Animal.
     */
    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimalById(@PathVariable int animalId) {
        service.deleteAnimalById(animalId);
        return service.getAllAnimals();
    }



}
