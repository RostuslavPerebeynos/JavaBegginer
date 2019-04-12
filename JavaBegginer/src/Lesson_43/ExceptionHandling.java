package Lesson_43;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		/*Перехоплення помилок*/
		
	//	Scanner scan = new Scanner(System.in);
	//	System.out.println("Введіть своє улюблене число: ");
		
		//1. спосіб піймання помилок через метод hasNext
		//Але цей метод використати можна якщо точно знаємо де
		//може вилізти помилка і таким спосбіом ми себе застрахували
		
	/*	if(scan.hasNext())
		{
			int number = scan.nextInt();
			System.out.println("Ваше улюблене число " + number);
		}else {
			System.out.println("Введення не є цілим числом");
		}
    */		
		// 2. спосіб
		
		// спробувати
	/*	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Введіть своє улюблене число: ");
			int number = scan.nextInt();
			System.out.println("Ваше улюблене число " + number);
		}
		//спіймати InputMismatchException, ArithmeticException .....
		catch(Exception spiymanaPomylka) {
			System.out.println("Такого робити не можна");
		}
		
		System.out.println("Програма закінчила виконання");
		*/
		boolean  yePomulka = false;
		do {//навіщо той цикл , допоки є помилка yePomulka буде виконуватися доти поки користовач не веде вірно дані
			try {
				Scanner s = new Scanner(System.in);
				System.out.println("Введіть чисельник: ");
				int с1 = s.nextInt();
				System.out.println("Введіть знаменник: ");
				int с2 = s.nextInt();
				System.out.println("Результат: " + с1/с2);
				yePomulka = false;
	
			}
			catch(Exception pomylka ) {
				yePomulka = true;
				System.out.println("Такого робити не можна: " + pomylka.getMessage());//getMessage - отримати повідомлення про помилку
			}
		}
		while(yePomulka);

	}

}
