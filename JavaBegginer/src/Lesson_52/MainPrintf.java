package Lesson_52;

public class MainPrintf {

	public static void main(String[] args) {
		
		/*метод prinf*/
		
		String s1 = "Місяць", s2 = "Вареник", s3 = "динозавр";
//		System.out.println(s1);
		
//		System.out.printf("%s", s1);// %s - (String) - текстовий рядок
//		System.out.printf("%S", s1);// %S - (String) - текстовий рядок велики літерами
//		System.out.printf("%20s", s1);// %{n}s - текстовий рядок довюиною мінімум {n} символів
									  // але є момент якщо слова менше 20 симолів то джава це заповне у вигляді пробілів
//		System.out.printf("%s, %s, %s", s1, s2, s3);// виведення більше ніж одного значення і ще потрібно пам'ятати що кількість аргументів і вказівників має бути одинаковою бо інакше програма злетить
		
		/*перший елемент %s це форматований рядко де симол % вказує
		 * джаві що наступний елмент після нього це є вкащівник формату
		 * і цей вказівник формату дає джаві зрозуміти як саме потрібно
		 * відформатувати дані які ми будемо виводити
		 * другий елемент це якрах ті дані які будуть виведені у форматованому 
		 * форматі*/
		
		int d1 = 123, d2 = 456, d3 = d1*d2;
		
//		System.out.printf("%d", d1);
//		System.out.printf("%d*%d=%d", d1, d2, d3); // в консолі це вишлядатиме так 123*456=56088
//		System.out.printf("%7d\n", d1); // %{n}d - рядок довжиною мінімум {n} символів
//		System.out.printf("%7d\n", d2); // \n - це перевести на новий рядок
//		System.out.printf("%7d\n", d3);
	
	
		double f1 = 123456789.01234; // f = "Floating point number"
		
//		System.out.printf("%f", f1); // %f - число з плаваючою точкою
//		System.out.printf("%.2f", f1); // заокруглити число до сотих получиться : 123456789,01
//		System.out.printf("%,.2f", f1); // розділювачі між тисячами і заокруглити до сотих : 123 456 789,01
		
//		System.out.printf("%d, %f, %s", d1, f1, s1);// якщо перепутати агрументи місцями то програма злетить
		
		//%n (або \n) - переведення курсора на наступний рядок
		//%% - символ %, наприклад printf("нас 100%"); => "нас 100%"
		//%b - (boolean) - значення булевого типу (true/false)
		//..................
	}

}
