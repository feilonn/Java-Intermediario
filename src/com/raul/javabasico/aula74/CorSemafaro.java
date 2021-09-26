package com.raul.javabasico.aula74;

public enum CorSemafaro {
	VERDE(1000), VERMELHO(2000), AMARELO(300);
	
	private int tempoEspera;
	
	CorSemafaro(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera() {
		return tempoEspera;
	}
	
	
}
