package Lesson_20;

import java.util.Scanner;

public class UmovnyiOperator {

	public static void main(String[] args) {

		/*
		 * Тернарний умовний оператор - він використовується для заміни if але тільки
		 * тоді коли є один if і один else і він має три умови
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть свій id номер: ");
		int id = scan.nextInt();

		/* Тернарний умовний оператор */
		// double price = (id > 1000 && id < 55000) ? 2.0 : 3.0;

		double price = 0.0;
		if (id > 1000 && id < 55000) {
			price = 2.0;
		} else {
			price = 3.0;
		}
		System.out.println("Ціна для вас = " + price);
	}

}
