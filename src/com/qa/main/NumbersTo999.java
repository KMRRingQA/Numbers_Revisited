package com.qa.main;

public class NumbersTo999 {
	String nameThatNumber (int Num1) {
		final String[] EinerstelleName = {
	            "", "one", "two", "three", "four", "five", "six", "seven",
	            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
	            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	    };
		final String[] ZehnerstelleName = {
				"", "one", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"
		};
		if (Num1<20) {
			return EinerstelleName[Num1];
		}
		else if (Num1>999) {
			System.out.println("You're supposed to enter a number n where 0<n<1000.");
			return null;
		}
		else if (Num1<100) {
			int Zehnerstelle = Num1/10;
			int Einerstelle = Num1%10;
			String FullName;
			FullName = ZehnerstelleName[Zehnerstelle] + " " + EinerstelleName[Einerstelle];
			return FullName;
		}
		else {
			int Hunderterstelle = Num1/100;
			int Zehnerstelle = (Num1/10)%10;
			int Einerstelle = Num1%10;
			String FullName;
			FullName = EinerstelleName[Hunderterstelle] + " hundred "+ ZehnerstelleName[Zehnerstelle] + " " + EinerstelleName[Einerstelle];
			return FullName;
		}
	}
}
