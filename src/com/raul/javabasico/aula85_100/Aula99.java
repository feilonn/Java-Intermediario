package com.raul.javabasico.aula85_100;

import java.util.Random;

public class Aula99 {

	public static void main(String[] args) {
		
		//UTILIZANDO Math | A classe Math � est�tica, logo seus m�todos podem ser chamados sem a necessidade de uma inst�ncia.
		System.out.println("Random com Math: "+Math.floor(Math.random()*20)); // Randomico at� 20
		
		
		//Utilizando o tipo Random | Podem ser gerados de varios tipos: int, Long, float, Double e etc.
		Random random = new Random();
		
		System.out.println(random.nextInt()); // Numero randomico que vai at� a capacidade m�xima do tipo int.
		System.out.println(random.nextInt(101)); // Numero randomico que vai de 0 at� 100, o ultimo numero n�o � considerado.
		System.out.println(random.nextInt(4)); // 0 a 3
		

	}

}
