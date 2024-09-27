SHIELD DATABASE

Heroes:
1. Obtener todos los heroes
	GET/hero
	HTTPResponseStatus: 200,404,500...
	
2. Insertar nuevo heroe
	POST/hero
	Body: Info del heroe
	HTTPResponseStatus: 201 (crear), 404, 500
	
3. Obtener un heroe en concreto
	GET/hero/{id} --> /hero/1
	HttpResponseStatus: 200, 404, 500
	
4. Borrar heroe
	DELETE/hero/{id} --> /hero/1
	HttpResponseStatus: 200, 202 404, 500



Poderes:
1. Obtener todos los poderes de un heroe:
	GET/hero/{id}/power
	
2. Añadir un poder a un héroe:
	POST/hero/{id}/power
	Body: Detaller del poder a añadir
	
3. Obtener un poder en concreto de un heroe:
	GET/hero/{id}/power/{powerId}