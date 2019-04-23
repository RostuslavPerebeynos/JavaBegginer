package Lesson_65;
/**
 * class Kit extends Tvaryna 
 * Для Java всі об'єкти дочірнього класу є атвоматично
 * також і об'єктами батьківського класу 
 * @author Ростислав
 *
 */
public class Main {

	public static void main(String[] args) {
		/*Поліморфічні аргументи у методи*/

		            Tvaryna t = new Tvaryna();
/*Tvaryna k*/		Kit k = new Kit();
/*Tvaryna k*/	    Myshka m = new Myshka();
		
		PokazatyTvaryna(t);
		PokazatyTvaryna(k);
		PokazatyTvaryna(m);
		
	}
	
	/*Саме завдяки поліморфізму в метод який приймає об'єкт параметр певного класу
	 * ми модемо передати оь'єкт підкласу в чому ми зробили вищи
	 * PokazatyTvaryna(t);
		PokazatyTvaryna(k);
		PokazatyTvaryna(m);*/
	public static void PokazatyTvaryna(Tvaryna t) {
		System.out.println("Показуємо тварину: ");
		t.Pryvitatysya();
	}

}
