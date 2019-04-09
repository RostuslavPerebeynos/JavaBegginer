package Lesson_32;

public class ArrayString {

	public static void main(String[] args) {
		
		/*Масив - об'єкт, який містить більше ніж один елемент
		 * того самого типу
		 * Кількість елементів в масиві вказується під час ініціалізації*/

		String[] litniMisyatsi = new String[3];
		
		
		litniMisyatsi[0] = "Червень";
		litniMisyatsi[1] = "Липень";
		litniMisyatsi[2] = "Серпень";
		
		String[] frukty =  {"Яблуко", "Чорниця", "Кавун"};
		
		for (int i = 0; i<frukty.length; i ++)
		{
			System.out.println(frukty[i]);
		}
	}

}
