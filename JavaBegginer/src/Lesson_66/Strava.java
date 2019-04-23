package Lesson_66;
/**
 * Коли класс є абстрактним ми не маємо право створювати
 * об'єкти цього класу тому ми щоб передати це в майн
 * ми створюємо об'єкт класу який унаслідує це клас в даному випадку
 * Нога динозавра і передаємо там параметри і все 
 * @author Ростислав
 *
 */
public abstract class Strava {

	public String nazvaStravy;
	
	public void Zgotuvaty() {
		System.out.println("Страва зготована");
	}
}
