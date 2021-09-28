package com.raul.javabasico.aula75_84;

import java.util.Scanner;

public class Aula78 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String banana = "banana";
		String nana = "NanA";
		String diario = "TE20210927";
		
		//System.out.println("Digite: ");
		//String usuario = scan.nextLine();
		
		System.out.println(banana.regionMatches(0, "ban", 0, 3));
		System.out.println(banana.regionMatches(1, "ana", 1, 3));
		System.out.println(banana.regionMatches(true, 2, nana, 0, 4)); // utilizando equalsIgnoreCase
		
		//System.out.println(diario.regionMatches(true, 2, usuario, 2, 4));
		
		System.out.println();
		System.out.println(banana.endsWith("ana"));
		System.out.println(banana.startsWith("ba"));

	}

}
