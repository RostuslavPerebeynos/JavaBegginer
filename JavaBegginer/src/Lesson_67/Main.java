package Lesson_67;
/**
 * Щераз в Java заборонено створювати об'єкти абстрактних класів
 * Клас - це шаблон, схема, або ж, прототип чогось
 * Об'єкт - це втілення класу
 * Абстрактний метод - це метод який повинен бути заміщений у дочірному класі
 * Треба пам'ятати що якщо хочаб один абстрактний метод є в класі то і клас повинен бути абстрактний 
 * @author Ростислав
 *
 */
public class Main {

	public static void main(String[] args) {
		// абстрактні методи

		Varenyk v = new Varenyk();
		v.Zgotuvaty();
		v.Rozigrity();
		NogaDynozavra n = new NogaDynozavra();
		n.Rozigrity();
	}

}
