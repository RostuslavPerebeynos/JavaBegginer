package Lesson_13;

import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть кількість морозива");
		int  icecrime;
		icecrime = scan.nextInt();
		
		//icecrime = icecrime+1;
		//icecrime++;
		//icecrime = icecrime+5;
		//icecrime+=5;
		
		System.out.print("Нова кількість: ");
		System.out.println(++icecrime); // пре-інкремент, спочатку виконує дію потім виводить
		System.out.println(icecrime++); // пост-інкремент, наоборот
		System.out.println(icecrime);
		/*Декрементом все аналогічно як з Інкрементом тільки віднімаємо --*/
		

	}

}
