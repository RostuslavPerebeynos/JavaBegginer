package Lesson_15;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		/*цикл While необхідний якщо ми певний шматок коду хочемо
		 * виконати декілька раз при цьому запустивши тільки один раз
		 * необхідний цей цикл*/
		
		/*int number = 1;
		
		while (number<10) //Він буде працювати до тих пір поки та рівність справджується
		{
			System.out.print(number);
			number++;
		}*/
//__________________________________________________________________________
		
		/*Scanner scan = new Scanner(System.in);
		int number2 = 0;
		
		while (number2!=7)
		{
			System.out.println("Вгадайте число між 0 і 10 :");
			number2 = scan.nextInt();
		}
 
		System.out.println("Вітаю ви вгадали!");
	}*/
//__________________________________________________________________________
		
		Scanner scan = new Scanner(System.in);
		String slovo = "";
		
		while(slovo.equals("чай") != true) //!= true - це означає якщо дана рівність не дорівнює
			                               //необхідно виконувати наступний фрагмент коду
		{
			System.out.println("Хочу чаю");
			slovo = scan.nextLine();
		}
		System.out.println("Дякую за чай");
   }
}