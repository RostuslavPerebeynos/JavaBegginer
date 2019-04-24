package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Різниця між List and Set
 * 1) В List є мутод get за допомою якого ми можемо дістати по індексу
 * а в set такого методу немає
 * 2) Метод remove в List він видаляє по індексу а в Set по значенню "" 
 * 3) Set на відмінно від List зберігає унікальне значення що це означає до прикладу
 * в нас є 4 об'єкта Sysana1 коли м и буде виводи через цикл на консоль то виведеться не всі 4 а
 * тільки один об'єкт Sysana1 . Тому метод remove видаляє по значеню 
 * 4) І для чого зручна колекція Set ми маємо велкий список і там є багато дублікатів
 * а хочемо від сортувати щоб вибило тільки унікальні по значенню заганяємо в колекцію
 * set і все нам виведе унікальні об'єкти по значенню не продублювавши
 * і це можна сказати головна з фішок set
 * 5) Одним словом особливість Set одна і дуже важилва це НЕ ПОВТОРЯТИ ЗНАЧЕННЯ)
 * 
 * @author Ростислав
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Sysana1");
		set.add("Sysana1");
		set.add("Sysana1");
		set.add("Sysana1");
		set.add("Sysana2");
		set.add("Sysana3");
		set.add("Sysana4");
		set.add("Sysana5");
		
		set.remove("Sysana3");
		
		Iterator<String> iterator1 = set.iterator();
		
//		while (iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//		}

		// або за допомою цикла форіч
		
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
	}

}
