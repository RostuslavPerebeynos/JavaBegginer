package Lesson_12;

import java.util.Scanner;

public class Kalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double number1, number2, rezult;
		String diya;
		
		System.out.println("Введіть перше число..");
		number1 = Double.parseDouble(scan.nextLine());
		/*Double.parseDouble - Це необхідно для того щоб ми поросили сканер
		 * зчитувати від користовача у вигляді текстового рядка scan.nextLine()
		 * і за допомогою .parseDouble прогорама сама переконвертує в число дабл
		 * Іншими словами це метод який конвертує змінну String в число Double*/
		
		System.out.println("Введіть дргуе число..");
		number2 = Double.parseDouble(scan.nextLine());
		
		System.out.println("Введіть дію (+-*/): ");
		diya = scan.nextLine();
		
		if (diya.equals("/") && number2 == 0) // && оператор "і" == оператор дорівнює
		{
			System.out.println("Ай-ай, на нуль ділити не можна");
			return;
			/*В даному випадку коли програма побачить це ключове слова
			 * вона завершить свою дію і не буде виконуватися*/ 
		}
		// .equals - використовується для порівняння стрінгових значень
		//в данаму випадку дію і плюс
		if(diya.equals("+") || diya.equals("додавання")) // || оператор "або"
		{
			rezult = number1 + number2;
		}
		else if (diya.equals("-")|| diya.equals("віднімання"))
		{
			rezult = number1 - number2;
		}
		else if (diya.equals("*")|| diya.equals("множення"))
		{
			rezult = number1 * number2;
		}
		else if (diya.equals("/")|| diya.equals("ділення"))
		{
			rezult = number1 / number2;
		}
		else 
		{
			rezult = 0;
		}

		System.out.println("Результат: " + rezult);
	}

}
