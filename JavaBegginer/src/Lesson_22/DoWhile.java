package Lesson_22;

public class DoWhile {

	public static void main(String[] args) {
		/*Умова після do в дужках виконується як мінімум один раз
		 * і рісля цього перевіряється в while на істиність*/
		
		int number = 125;//прошрама виконається і буде результат 125
		do //виконати якісь дії/операції
		{
			System.out.println(number);
			number++;
		}
		while(number<=7); // допоки
	}

}
