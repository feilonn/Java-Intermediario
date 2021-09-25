package com.raul.javabasico.aula69;

public class MinhaThreadRunnable implements Runnable{
	
	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public void run() {
		try {
			for(int i = 0; i < 6; i++) {
				System.out.println(nome+" contador = "+i);

				Thread.sleep(this.tempo);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("** "+this.nome+" terminou sua exucação. **");
	}
}
