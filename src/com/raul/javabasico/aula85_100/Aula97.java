package com.raul.javabasico.aula85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97 {

	public static void main(String[] args) {
		
		String padrao = "###,###.##"; // PADRÃO BR
		DecimalFormat df = new DecimalFormat(padrao);
		
		System.out.println(df.format(1234567890.123));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "United States"));
		dfs.setDecimalSeparator('.'); // PADRAO US
		dfs.setGroupingSeparator(',');
		
		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		
		System.out.println(df.format(1234567890.123));
		
	}

}
