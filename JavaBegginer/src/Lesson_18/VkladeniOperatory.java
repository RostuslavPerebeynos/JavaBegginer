package Lesson_18;

public class VkladeniOperatory {

	public static void main(String[] args) {

		int vik = 17;

		/*
		 * Оператор if перевіряє певну умову, якщо вона справджується виконує якусь дію
		 */
		if (vik < 18) {
			System.out.println("Ви неповнолітній/-я");
			if (vik <= 10) // Цей фрагмент коду називається вкладиним оператором if
			{
				System.out.println("Ви дуже юний/-а");
			} else {
				System.out.println("Вам лишилось кілька років до повноліття");
			}
			switch (vik) // це приклад того що можні вкладати і інші оператори
			{
			case 17:
				System.out.println("Вам 17 років скоро повноліття");
				break;
			}
		} else {
			System.out.println("Ви повнолітній/-я");
			if (vik < 60) {
				System.out.println("Вам менше 60");
			} else {
				System.out.println("Вам за 60");
			}
		}

	}

}
