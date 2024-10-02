package com.taida.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taida.springboot.dao.HeroDaoService;
import com.taida.springboot.model.Hero;

@RestController
public class HeroController {
	
	@Autowired
	private HeroDaoService heroDaoService;
	
	@GetMapping("/hero")
	public List<Hero> findAllHeroes(){
		return heroDaoService.findAll();
	}
	
	@GetMapping("/hero/{id}")
	public Hero findHeroById(@PathVariable int id) {
		return heroDaoService.findHeroById(id);
		
	}
	@PostMapping("/hero")
	public Hero addHero(@RequestBody Hero hero) {
		return heroDaoService.addHero(hero);
	}
	
	/*@DeleteMapping("/hero")
	public boolean deleteHero(int id) {
		return heroDaoService.deleteHero(id);
	}
	 * */
	
	
	
	
	
}
