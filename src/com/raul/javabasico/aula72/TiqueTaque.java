package com.raul.javabasico.aula72;

public class TiqueTaque {

	boolean tique;

	synchronized void tique(boolean estaExecutando) {

		if(!estaExecutando) {
			this.tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		try {
			while(tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void taque(boolean estaExecutando) {

		if(!estaExecutando) {
			this.tique = false;
			notify();
			return;
		}

		System.out.println("Taque");
		
		tique = false;

		notify();

		try {
			while(!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

