package com.raul.javabasico.aula62;

public class VarArgs {

	public static void main(String[] args) {
	
		System.out.println("Soma com VarArgs = "+soma(1,2,3,4,5,6,7,8,9,10));
		System.out.println("Soma com VarArgs + Argumentos = "+soma2(1,2,3,4,5,6,7,8,9,10));
	}
	
	static int soma(Integer... meusInteiros) { // Declaraçao [TipoDeDado...] indica n parametros do tipo especificado.
		int total = 0;
		for(int i = 0; i < meusInteiros.length; i++) { // Percorrendo o Var Args como um array.
			total += meusInteiros[i];
		}
		
		return total;
	}
	
	static int soma2(int a, int b, Integer... meusInteiros) { // Irá desconsiderar os dois primeiros elementos do Var args.
		int total = 0;
		for(int i = 0; i < meusInteiros.length; i++) { // Percorrendo o Var Args como um array.
			total += meusInteiros[i];
		}
		
		return total;
	}

}
