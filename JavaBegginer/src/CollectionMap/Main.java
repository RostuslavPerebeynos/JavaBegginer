package CollectionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Map і його особливості
 * 1) Він може приймати не один інженерик "<>" а два <Ключ, Значення> якщо цього потрибує
 * інтерфейс
 * 2) це єдиний інтерфейс який немає ітератора
 * 
 * @author Ростислав
 *
 */
public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Cat1");
		list.add("Cat2");
		list.add("Cat3");
		list.add("Cat4");
		list.get(0); //дістаємо по індексу 
		list.remove(2);//видаляємо по індексу
		for(String paper : list) {
			System.out.println(paper);
		}
		
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		//    1       2      3       4     - елементи і кожен зних має ключ і його значення
		// [key:2][key1:2][key2:3][key3:4]
		// і як бачимо ключі мають бути різними (унікальними) а значення можуть повторятися
		// бо якщо ми створимо з таким самим ключом новий елемент то автоматично стремо попередній так би мовити замінимо
		// і тому в тій колекції не може повторятися
		map.put("key", 2);
		map.put("key1", 7);
		map.put("key2", 8);
		map.put("key3", 10);
		
		Integer key = map.get("key2");
		System.out.println(key);
		
		map.remove("key1"); // видалимо елемент
		
		for(String k : map.keySet()) { // тут ми виводимо всі ключі
			System.out.println(k);
		}
		
		for(Integer v : map.values()) { // тут ми получимо всі значення
			System.out.println(v);
		}

	}

}
