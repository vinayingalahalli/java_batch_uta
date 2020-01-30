package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnimalController {
	@Autowired
	private AnimalService service;
	
	@GetMapping("/animal")
	public List<Animal> getAllAnimals(){
	return service.getAllAnimals();	
	}
	
	@GetMapping("/animal/{id}")
	public Animal getAnimalById(@PathVariable("id") int id){
		return service.getAnimalById(id);
	}
	@PostMapping("/animal")
	public Animal addAnimal(@RequestBody Animal animal) {
		return service.addAnimal(animal);
	}
	@PutMapping("/animal")
	public Animal updateAnimal(@RequestBody Animal animal) {
		return service.updateAnimal(animal);
	}
	@DeleteMapping("/animal/{id}")
	public void deleteAnimalById(@PathVariable("id") int id){
		service.deleteAnimalById(id);
	}
	@GetMapping("/animal/age/{age}")
	public List<Animal> getAnimalsByAge(@PathVariable("age") int age){
		return service.getAnimalsByAge(age);
	}
}
