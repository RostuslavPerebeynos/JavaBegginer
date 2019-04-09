package Lesson_30;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random kubyk = new Random();
		int numberZkubyka = 0, variantKorystuvacha = 0, sproba = 0;
		
		do {
			System.out.println("Введіть число від 1 до 6: ");
			 variantKorystuvacha = scan.nextInt();
			 numberZkubyka = kubyk.nextInt(6);
			 System.out.println("А на кубику випало " +  numberZkubyka + ".");
			 System.out.println("___________________________________________");
			 sproba++;
		}
		while(variantKorystuvacha==numberZkubyka);
		System.out.println("Бінго ви вгадали з " + sproba + " спроби");
	}

	

}
