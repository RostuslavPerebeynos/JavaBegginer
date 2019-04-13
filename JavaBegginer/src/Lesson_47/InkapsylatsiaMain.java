package Lesson_47;
/**
 * Інкапсуляція - полягає в тому, що в класі ми приховуємо,
 * поля, так, що вони не видимі нікому ззовні (за допомогою модифікатора
 * "private").
 * Натомість, ми створюємо ("public") методи, які дають нам можливість
 * записати чи зчитати інформацію з цих полів.
 * 
 * Переваги інкапсуляції: 
 * 1. Можливість котролю над тим, яку значення записується у поле класу
 * 2. Легкість зміни логіки/правила для значення поля класу, не ламаючи
 * інші модулі, які використовують цей клас/поле
 * 3. Гнучкість
 * @author Ростислав
 *
 */
public class InkapsylatsiaMain {

	public static void main(String[] args) {
		
		/*Інкапсуляція*/
		
		Person Ivan = new Person();
		Ivan.setImya("Ivan");//Додана перевірка в класі Person
		Ivan.setPrizv("Polihas");
		Ivan.setVik(27); // ми в класі Person додали перевірку в setter
		Ivan.setProfesiya("Модератор");

	}

}