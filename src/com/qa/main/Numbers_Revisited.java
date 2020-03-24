package com.qa.main;

public class Numbers_Revisited {

	void listNumbers() {
		NumbersTo999 numbersTo999 = new NumbersTo999();
		for (int i=1;i<=999;i++) {
			System.out.println(numbersTo999.nameThatNumber(i));
		}
		

	}

}
