package com.raul.javabasico.aula85_100;

import java.util.Random;

public class Aula99 {

	public static void main(String[] args) {
		
		//UTILIZANDO Math | A classe Math é estática, logo seus métodos podem ser chamados sem a necessidade de uma instância.
		System.out.println("Random com Math: "+Math.floor(Math.random()*20)); // Randomico até 20
		
		
		//Utilizando o tipo Random | Podem ser gerados de varios tipos: int, Long, float, Double e etc.
		Random random = new Random();
		
		System.out.println(random.nextInt()); // Numero randomico que vai até a capacidade máxima do tipo int.
		System.out.println(random.nextInt(101)); // Numero randomico que vai de 0 até 100, o ultimo numero não é considerado.
		System.out.println(random.nextInt(4)); // 0 a 3
		

	}

}
