package com.raul.javabasico.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf('h')); // return -1 ~> não existe
		System.out.println(banana.indexOf('a'));
		System.out.println(banana.indexOf(ana));
		
		System.out.println(banana.lastIndexOf('n'));
		System.out.println(banana.lastIndexOf(ana));
		
		System.out.println(banana.contains(ana)); // return true || false
		System.out.println(banana.contains("arroz"));

	}

}
