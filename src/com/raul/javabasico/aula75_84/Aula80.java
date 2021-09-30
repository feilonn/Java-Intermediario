package com.raul.javabasico.aula75_84;

public class Aula80 {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15)); // o caractere da ultima posição é desconsiderado, nesse caso, o 15.
		
		String ola = "Olá";
		String mundo = " Mundo!";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e'); // replace padrão - primeira ocorrencia
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", ""); // replace para todas as ocorrencias.
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim()); // Remove os espaços antes e depois da String.
	}

}
