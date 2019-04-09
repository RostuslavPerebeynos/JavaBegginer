package Lesson_37;

import java.util.Scanner;

public class TableArray {

	public static void main(String[] args) {
		
		/*Виведення масиву в таблицю*/
		
		int[] igry = {1896, 1900, 1902, 1904, 1906, 1908, 1912, 1916, 1920, 1924, 1928, 1932};
		String[] country = {"Greece", "France", "United States", "Greece", "Unided King", "UK", "UK", "UK", "UK","UK","UK","UK",};
		String[] city = {"Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv","Lviv"};
		
		/*Для того щоб вивсти у вигляді таблиці ми будемо використовувати табуляцію \t*/
		
//		System.out.println("Index\tРік\tКраїна і місто");
//		for (int i =0; i<igry.length; i++)
//		{
//			System.out.print(i+"\t");
//			System.out.print(igry[i]+"\t");
//			System.out.print(country[i]+ " - " + city[i] + "\n"); //\n цей символ вказує що потрібно перевести курсор на наступний рядок
//			
//		}
		
		System.out.println("Введіть рік: ");
		Scanner scan = new Scanner(System.in);
		int rik = scan.nextInt();
		boolean znajedeno = false;
		for (int j = 0; j<igry.length; j++)
		{
			if(igry[j]==rik)
			{
				System.out.print(j+"\t");
				System.out.print(igry[j]+"\t");
				System.out.print(country[j]+ " - " + city[j] + "\n");
				znajedeno = true;
			}
		}
		if (!znajedeno) // (Якщо знайдено не дорівнює істинні) це ще можна записати так znajedeno != true або znajedeno = false
		{
			System.out.println("Вибачте у введеному році ігор не відбувалося");
		}	
	}

}
