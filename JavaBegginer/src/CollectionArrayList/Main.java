package CollectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
/**
 * ArrayList - він свого роду масив. <> - ті скопки називаються джейнерик в них ми передаємо
 * той тип даних який ми хочемо використовувати 
 * ArrayList не може приймати примітивні типи а тільки силочні String Integer Byte
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
        al.add("Hello"); 
        al.add("Hi baby");
        al.add("Lalalala");
		
        
		System.out.println(al.size());// цей метод виртає розмір нашої колекції так так не lengh() а size() - імено для колекцій
		
		System.out.println(al);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("");
		
		for(int i = 1; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("");
		
		al.set(1, "Funny");//замінили
		al.set(0, "Hi:)");
		
		al.remove(2);// ми видалил під індексом 2 але треба пам'ятати якщо ми видалямо якісь індекс
		            // то тоді там зміщується до прикладу те що будо до того ідексом 3 після видалення стає вже другим))
		
		al.add(2, "Korolin");// ми добавили за індексом так тоже можна))) І тожу треба памятати що буде переміщатися
		                     // якщо ми будемо добавляти замість вже існуючого індекса і той що був припустемо під 2 стане 3 за індексом )))
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("");
		
		//ми тут в цей список не вказали <> джейнерик тип даних тому можна добаляти любий
		List list = new ArrayList();
		list.add(2);
		list.add("Машина");
		list.add(3);
		
//		list.isEmpty();// це важливий метод який говорить чи пуста наша колекція?
		boolean empty = list.isEmpty();
		System.out.println(empty); //В даному випадку  ми получемо false а якщо закоментувати наші елменти
		                           //і зробити колекція (список) пустим то поверне true
		
		/*Інтерфейс ітератор він має всього три методи*/
		Iterator <Integer> iterator = list.iterator();
		iterator.hasNext(); // цей метод провіряє чи є слідощий елемент в нащому списку
		iterator.next(); //повертає слідощий елемент де це використовують то прикладу цикл while
		iterator.remove();// який видаляє
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
