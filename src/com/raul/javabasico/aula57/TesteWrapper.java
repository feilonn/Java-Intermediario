package com.raul.javabasico.aula57;

public class TesteWrapper {
	public static void main(String[] args) {
		
		@SuppressWarnings("deprecation")
		Short num7 = new Short((short)1);
		Byte num8 = new Byte((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		//Autoboxing
		Short num13 = 1;
		Byte num14 = 10;
		Integer num15 = 100;
		Long num16 = 10000l;
		Float num17 = 3.5f;
		Double num18 = 3.5555;
		Boolean flag3 = true;
		Character c = 'c';
		
	}
}
