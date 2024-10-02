package com.taida.springboot.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taida.springboot.model.Hero;

@Service
public class HeroDaoService {

	private static List<Hero> heroes= new ArrayList<>();
	
	static {
			heroes.add(new Hero(1, "Peter Parker", "Spiderman", new Date()));
			heroes.add(new Hero(2, "Tony Stark", "Ironman", new Date()));
			heroes.add(new Hero(3, "Selina Kyle", "Catwoman", new Date()));
	}
			
	private static int counter = 3;

	//Obtener todos los heroes
	public List<Hero> findAll(){
		return heroes;
	}

	//Obtener 1 heroe en concreto
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
