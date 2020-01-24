package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.AnimalDAO;
import com.app.model.Animal;
@Service
public class AnimalServiceImpl implements AnimalService {
	@Autowired
	private AnimalDAO animalDao;

	@Override
	public List<Animal> getAllAnimals() {
		// TODO Auto-generated method stub
		return animalDao.findAll();
	}

	@Override
	public Animal getAnimalById(int id) {
		// TODO Auto-generated method stub
		return animalDao.findById(id).get();
	}

	@Override
	public Animal addAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return animalDao.save(animal);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return animalDao.save(animal);
	}

	@Override
	public void deleteAnimalById(int id) {
		animalDao.deleteById(id);
		
		
	}

	@Override
	public List<Animal> getAnimalsByAge(int age) {
		// TODO Auto-generated method stub
		return animalDao.findByAge(age);
	}

}
