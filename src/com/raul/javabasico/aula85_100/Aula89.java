package com.raul.javabasico.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
		Calendar hoje = Calendar.getInstance(); // Usando Calendar
		String dataFormatada = sdf.format(hoje.getTime());
		
		Date data = new Date(); // Usando Date
		
		System.out.println(dataFormatada);
		System.out.println(sdf.format(data));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "26/02/1998";
		
		try {
			Date converteStringDate = sdf2.parse(minhaData);
			System.out.println(sdf.format(converteStringDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
