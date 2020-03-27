package com.qa.main;

public class Numbers_Revisited {

	void listNumbers() {
		BetterNumberNamer betterNumberNamer = new BetterNumberNamer();
		for (long i = 1; i <= 1000000; i++) {
			int length = (betterNumberNamer.howLong(i));
			int[] Split = betterNumberNamer.splitIntoArray(i, length);
			betterNumberNamer.nameThatNumber(Split, length);
			System.out.println("");
		}
	}
}
