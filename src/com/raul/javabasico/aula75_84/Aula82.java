package com.raul.javabasico.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		
		String[] alfa = {"F", "G", "H", "I"};
		String testa = alfa.toString().join(" -> ", alfa);
		System.out.println(testa);
		
		String alfabeto = String.join(", ", "A", "B", "C", "D", "E");
		System.out.println(alfabeto);
		
		String raul = "raul";
		String correia = "correia";
		
		raul = raul.join(" ", raul, correia);
		
		System.out.println(raul.toUpperCase());
		
		String[] letras = alfabeto.split(", ");
		for(String letra : letras) {
			System.out.print(letra);
		}
		
		System.out.println();
		String doArquivo = "1;Raul;23";
		String[] infos = doArquivo.split(";");
		for(String info : infos) {
			System.out.println(info);
		}
		

	}

}
