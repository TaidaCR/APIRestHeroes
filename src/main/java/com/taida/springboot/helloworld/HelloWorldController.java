package com.taida.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Anotar la clase como un controlador
//CRear métodos que respondan a los endpoint
//Configurar esos metodos
@RestController
public class HelloWorldController {

	//Hello-World
	//GET				//Endpoint
	@GetMapping(value= "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	//devuelve el mensaje en formato json
	@GetMapping(value="/hello-world-bean")
	public BeanResponse helloWorldBean(){
		return new BeanResponse("Hello World Bean!");
		}
	
	@GetMapping(value= "/hello-world/path-variable/{name}")
	public String helloWorldVariable(@PathVariable String name) {
		return "Hello " + name + "!";
	}
}
