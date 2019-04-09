package Lesson_16;

public class Method {

	public static void main(String[] args) {
		
		/*Метод - це окремий блок коду, який містить набір команд*/
		
		SayHowAreYou();
		SayHi(); // викликали метод
		SayHowAreYou();
		
		/*Побтрібно памятати розміщення методів немає значення
		 * лише має значення в якій послідовності ми викликаємо метод
		 * І ще одне Ризикова ситуація, коли метод викликає сам себе(рекурсивний)
		 * це ризиковано і може викликати безкінечність
		 * В чому особливість медоту це якраз в тому що ми можемо його використовувати 
		 * багато раз один і той самий наприкладі в main є двічі SayHowAreYou() */
		
		}
	
		public static void SayHi()
		{
			System.out.println("Привіт");
			SayGood();
		}
		public static void SayHowAreYou()
		{
			System.out.println("Як справи");
		}
		public static void SayGood()
		{
			System.out.println("Добре дякую");
		}

}
