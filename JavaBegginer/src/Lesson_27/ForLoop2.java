package Lesson_27;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		
		/*Цикл - це оператор, який дає можливість виконувати фрагмент
		 * коду повторно (поки справджується якась умова)*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть слова: ");
		String slovo = scan.nextLine();
		
		
		for (int i = slovo.length()-1; i >= 0; i --)
		{
			System.out.print(slovo.substring(i, i + 1));
			/*substring - ця функція повертає частинку слова і ми там
			 * можемо передати два параметри пергий параметир з якої букви почати
			 * другий параметир на якій букві закінчити
			 * Програма виводить слова задом на перед)))
			 * */
		}

	}

}
