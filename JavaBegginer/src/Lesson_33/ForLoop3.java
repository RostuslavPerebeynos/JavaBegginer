package Lesson_33;

public class ForLoop3 {

	public static void main(String[] args) {
		
		/*Вдосконалений цикл for*/
		
		int [] numbers = {123, 65, 179, 34566, 9000};
		// ініціалізація - це присвоєння початкового значення змінної
		
		      /* Звичайний цикл for */
		for (int i = 0; i < numbers.length; i++ )
		 {
			 System.out.println(numbers[i]);
		 }
		
		      /*Вдосконалений цикл for*/
		for (int c: numbers)
		{
			System.out.println(c);
		}
		/*Що він означає, що необхідно для кожного елементу з масиву numbers
		 * взяти кожен елемент і присвоїти його  в тим часову змінну int c
		 * і тоді в середині цикла for ми можемо використовувати цю змінну*/

		String [] city = {"Львів", "Київ", "Харків", "Дніпро"};
		
		for (String myCity : city)
		{
			System.out.println(myCity);
		}
	}

}
