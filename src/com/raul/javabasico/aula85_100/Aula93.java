package com.raul.javabasico.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Aula93 {

	public static void main(String[] args) {
		
		// DATA
		LocalDate agora = LocalDate.now(); // formato Ano-Mes-Dia
		
		System.out.println(agora);
		
		System.out.println(LocalDate.of(2021, 2, 26)); // Passando uma data específica para o formato LocalDate
		System.out.println(LocalDate.parse("2021-03-09")); // Convertendo String pada LocalDate |
														//a String precisa estar com a padranização esperada

		System.out.println(agora.plusDays(30));
		System.out.println(agora.minusDays(30));
		
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfMonth());
		System.out.println(agora.getDayOfYear());
		
		System.out.println(agora.isLeapYear()); // Verifica se é ano bisexto
		
		//HORA
		LocalTime horaAgora = LocalTime.now(); // Horario com o tipo LocalTime
		System.out.println(horaAgora);
		
		System.out.println(LocalTime.parse("21:06")); // Convertendo String para o formato LocalTime
		
		//DATA E HORA
		LocalDateTime horaDataAgora = LocalDateTime.now();
		System.out.println(horaDataAgora);
		
		System.out.println(horaDataAgora.plusYears(7));
		
		System.out.println(LocalDateTime.parse("2021-10-03T21:15:33")); // Convertendo String para LocalDateTime
		
		//FUSO
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		ZoneId zona = ZoneId.of("America/Fortaleza");
		System.out.println(zona);
		
		//Convertendo Date e Calendar para LocalDateTime
		Date data = new Date();
		Calendar cal = Calendar.getInstance();
		
		LocalDateTime dateConvert = LocalDateTime.ofInstant(data.toInstant(), zona);
		LocalDateTime calendarConvert = LocalDateTime.ofInstant(cal.toInstant(), zona);
		
		System.out.println("Date convertida para DateLocalTime: "+dateConvert);
		System.out.println("Calendar convertido para DateLocalTime: "+calendarConvert);
	}

}
