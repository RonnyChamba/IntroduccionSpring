package com.curso.spring;

import org.springframework.stereotype.Component;

@Component("miSaludo")
public class SaludoImpl  implements Saludo{

	@Override
	public void saludar() {
		
		System.out.println("Hola Mundo Spring");
		
	}
	
}
