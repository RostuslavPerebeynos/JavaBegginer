package Lesson_31;

public class Array {

	public static void main(String[] args) {
		
		int number = 7;
		
		int[] number2 = new int[3];
		/*виділить об'єм памяті, достатнього розміру,
		 * щоб записати три значення типу int*/
		number2[0] = 7; number2[1] = 9; number2[2] = 15;
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		
		
		int[] numbers = {3,5,6};
		numbers[2] = 999;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
	}

}
