package com.taida.springboot.dao;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.taida.springboot.model.Hero;

public class HeroDaoService {

	private static List<Hero> heroes= Arrays.asList(
			new Hero(1, "Peter Parker", "Spiderman", new Date()),
			new Hero(2, "Tony Stark", "Ironman", new Date()),
			new Hero(3, "Selina Kyle", "Catwoman", new Date()));
			
	private static int counter = 3;
	
	//Obtener todos los heroes
	@GetMapping (value="/heroes/all")
	public List<Hero> findAll(){
		return heroes;
	}
	
	//Obtener 1 heroe en concreto
	@GetMapping (value="/heroes/{1}") 
	public Hero findHeroById(int id) {
		Hero result = null;
		for (Hero hero: heroes) {
			if (hero.getId() == id) {
				result = hero;
			} 
		}
		return result;
	}
	
	//Añadir 1 heroe nuevo
	@PostMapping ()
	public Hero addHero(Hero hero) {
		hero.setId(++counter);
		heroes.add(hero);
		return hero;
	}
	
	//Borrar 1 heroe
	public boolean deleteHero(int id) {
		Iterator<Hero>heroIterator = heroes.iterator();
		Hero heroToRemove = null;
		do {
			heroToRemove = heroIterator.next();
			if (heroToRemove.getId()==id) {
				heroIterator.remove();
				return true;
			}
		}while (heroIterator.hasNext());
		return false;
	}
}
