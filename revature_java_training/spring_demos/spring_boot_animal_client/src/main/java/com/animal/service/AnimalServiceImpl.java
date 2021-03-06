package com.animal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.animal.model.Animal;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	
	private RestTemplate restTemplate=new RestTemplate();
	private String url="http://localhost:9000/animal/";
	@Override
	public List<Animal> getAllAnimals() {
		ResponseEntity<List<Animal>> entity=restTemplate.exchange(url, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Animal>>() {
				});
		return entity.getBody();
	}

	@Override
	public Animal getAnimalById(int id) {
		ResponseEntity<Animal> entity=restTemplate.exchange(url+id, HttpMethod.GET,null,Animal.class);
		return entity.getBody();
	}

	@Override
	public Animal addAnimal(Animal animal) {
	
		return restTemplate.postForObject(url, animal, Animal.class);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		restTemplate.put(url, animal);
		return animal;
	}

	@Override
	public void deleteAnimalById(int id) {
		restTemplate.delete(url+id);
		
		
	}

	@Override
	public List<Animal> getAnimalsByAge(int age) {
	return null;
	}

}
