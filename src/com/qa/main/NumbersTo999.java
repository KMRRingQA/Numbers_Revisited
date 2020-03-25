package com.qa.main;

public class NumbersTo999 {
	String nameThatNumber (int Num) {
		String FullName;
		final String[] EinerstelleName = {
	            "", "one", "two", "three", "four", "five", "six", "seven",
	            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
	            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
	    };
		final String[] ZehnerstelleName = {
				"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"
		};
		if (Num<20) {
			return EinerstelleName[Num];
		}
		else if (Num>9999) {
			System.out.println("You're supposed to enter a number n where 0<n<1000.");
			return null;
		}
		else if (Num<100) {
			if (Num%10==0) {
				int Zehnerstelle = Num/10;
				FullName = ZehnerstelleName[Zehnerstelle];
				return FullName;
			}
			else {
				int Zehnerstelle = Num/10;
				int Einerstelle = Num%10;
				FullName = ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
				return FullName;
			}
		}
		else if (Num<1000)	{
			int Hunderterstelle = Num/100;
			if (Num%100==0) {
				FullName = EinerstelleName[Hunderterstelle] + " hundred ";
				return FullName;
			}
			if (Num%100<20) {
				int Einerstelle = Num%100;
				FullName = EinerstelleName[Hunderterstelle] + " hundred and " + EinerstelleName[Einerstelle];
				return FullName;
			}
			if (Num%10==0) {
				int Zehnerstelle = (Num/10)%10;
				int Einerstelle = Num%10;
				FullName = EinerstelleName[Hunderterstelle] + " hundred and " + ZehnerstelleName[Zehnerstelle] + " " + EinerstelleName[Einerstelle];
				return FullName;
			}
			else {
				int Zehnerstelle = (Num/10)%10;
				int Einerstelle = Num%10;
				FullName = EinerstelleName[Hunderterstelle] + " hundred and " + ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
				return FullName;
			}
		}
		else {
			if (Num%1000==0) {
				int Tausenderstelle = Num/1000;
				FullName = EinerstelleName[Tausenderstelle] + " thousand";
				return FullName;
			}
			else if (Num%1000<20) {
				int Tausenderstelle = Num/1000;
				int Zehnerstelle = (Num/100)%10;
				int Einerstelle = Num%1000;
				FullName = EinerstelleName[Tausenderstelle] + " thousand and " + ZehnerstelleName[Zehnerstelle] + EinerstelleName[Einerstelle];
				return FullName;
			}
			else if (Num%1000<100) {
				if (Num%10==0) {
					int Tausenderstelle = Num/1000;
					int Zehnerstelle = (Num/10)%10;
					FullName = EinerstelleName[Tausenderstelle] + " thousand and " + ZehnerstelleName[Zehnerstelle];
					return FullName;
				}
				else {
					int Tausenderstelle = Num/1000;
					int Zehnerstelle = (Num/10)%10;
					int Einerstelle = Num%10;
					FullName = EinerstelleName[Tausenderstelle] + " thousand and " + ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
					return FullName;
				}
			}
			else {
				if (Num%100==0) {
					int Hunderterstelle = (Num/100)%10;
					int Tausenderstelle = Num/1000;
					FullName = EinerstelleName[Tausenderstelle] + " thousand " + EinerstelleName[Hunderterstelle] + " hundred";
					return FullName;
				}
				else if (Num%100<20) {
					int Einerstelle = Num%100;
					int Hunderterstelle = (Num/100)%10;
					int Tausenderstelle = Num/1000;
					FullName = EinerstelleName[Tausenderstelle] + " thousand " + EinerstelleName[Hunderterstelle] + " hundred and " + EinerstelleName[Einerstelle];
					return FullName;
				}
				else if (Num%10==0) {
					int Tausenderstelle = Num/1000;
					int Hunderterstelle = (Num/100)%10;
					int Zehnerstelle = (Num/10)%10;
					FullName = EinerstelleName[Tausenderstelle] + " thousand " + EinerstelleName[Hunderterstelle] + " hundred and "+ ZehnerstelleName[Zehnerstelle];
					return FullName;
				}
					else {
						int Tausenderstelle = Num/1000;
						int Hunderterstelle = (Num/100)%10;
						int Zehnerstelle = (Num/10)%10;
						int Einerstelle = Num%10;
						FullName = EinerstelleName[Tausenderstelle] + " thousand " + EinerstelleName[Hunderterstelle] + " hundred and "+ ZehnerstelleName[Zehnerstelle] + "-" + EinerstelleName[Einerstelle];
						return FullName;
					}
				}
		}
	}
}