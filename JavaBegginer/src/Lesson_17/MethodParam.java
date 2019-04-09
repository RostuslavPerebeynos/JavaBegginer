package Lesson_17;

import java.util.Scanner;

public class MethodParam {

	public static void main(String[] args) {
		
		/*Методи з параметрами*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		System.out.println("Enter your city");
		String city = scan.nextLine();
		double myVaga = 75.5;
		SayHi(name, city, 25, myVaga);
		
		/*Потрібно памятати що для методу важлива послідовність
		 * змінних інакше якщо до прикладу поміняти name , city
		 * місцями то получиться Привіт! Lviv з міста Bob*/
		/*_____________________________________________________*/
		/*Можна ще спрости програму і зразу вести в SayHi(name, city);
		 * SayHi("Bob", "Lviv"); без сканера і виведе теж сама
		 * Це показує зо не обовязкова передавати змінну можна передати зразу
		 * значення  */
	}
	public static void SayHi(String name, String city, int vik, double vaga) { //потірбно добавити тип і назву
		
		System.out.println("Привіт! " + name + " з міста " + city + "; вік: " + vik + " Моя вага =" + vaga);
	}

}
