package com.raul.javabasico.aula71;

public class Calculadora {
	
	private int soma;
	
	public synchronized int somaArray(int[] array) { // synchronized = uma thread acessando o método por vez.
		
		this.soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			this.soma += array[i];
			
			System.out.println("Executando soma "+Thread.currentThread().getName() + 
					" somando o valor "+array[i] + " com o total de "+soma);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return soma;
	}	
}
