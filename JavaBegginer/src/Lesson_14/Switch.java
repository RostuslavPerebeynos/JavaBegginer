package Lesson_14;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
		/*Switch - оператор ще відомий як інструкція перемикач або оператор вибору*/
		/*System.out.println("Введіть першу літеру своєї області:");
		String litera = "";
		Scanner scan = new Scanner(System.in);
		litera = scan.nextLine();
		
		switch (litera.toLowerCase())     //порівнюмо //.toLowerCase() - метод перетворить велику букву в маленьку
		{
		case "в":    //якщо "в"
			System.out.println("Вінницька або Волинська");
			break;
		case "д":
			System.out.println("Дніпро або Донецьк");
			break;
		default:   //В будь якому іншому випадку
			System.out.println("Області на таку літеру не знайдено");
			break;
		}*/
		
		
		System.out.println("Введіть літеру :");
		String litera = "";
		Scanner scan = new Scanner(System.in);
		litera = scan.nextLine();
		
		switch(litera.toLowerCase())
		{
		case "а":
		case "е":
		case "є":
		case "и":
		case "і":
			System.out.println("це голосна");
			break;
		case "п":
		case "р":
		case "с":
		case "т":
		case "ф":
		case "ш":
			System.out.println("це приголосна");
			break;
		default:
			System.out.println("В українському алфавіті такої букви немає");
			break;
		}
		

	}

}
