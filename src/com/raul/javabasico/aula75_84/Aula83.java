package com.raul.javabasico.aula75_84;

public class Aula83 {

	public static void main(String[] args) {
		
		String[] letras = {"B", "C", "D", "E", "F"};
		
		String alfabeto = "";
		
		StringBuffer sb = new StringBuffer(); // thread safe | Utilizando para concatenar array de String
		for(String letra : letras) {
			sb.append(letra);
		}
		
		alfabeto = sb.toString();
		System.out.println("ALFABETO = "+alfabeto);
		System.out.println("BETOALFA = "+sb.reverse());
		
		StringBuilder sb2 = new StringBuilder(); // not thread safe | Mesma funcionalidade do StringBuffer
		for(String letra: letras) {
			sb2.append(letra);
		}
		
		alfabeto = "";
		alfabeto = sb2.toString();
		System.out.println("ALFABETO = "+alfabeto);
	}

}
