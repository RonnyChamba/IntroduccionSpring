package com.curso.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author Ronny Chamba
 *
 */
public class Test {

	public static void main(String[] args) {
	
	
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
			
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
		
		Saludo saludo =  (Saludo)context.getBean("miSaludo");
		
		saludo.saludar();
		
		context.close();

	}

}
