package com.raul.javabasico.aula85_100;

import java.util.Calendar;

public class Aula87 {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH) + 1; // janeiro == 0
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		
		System.out.println("~["+hora+":"+minutos+"] Says: Hoje é "+dia+"/"+mes+"/"+ano);

	}

}
