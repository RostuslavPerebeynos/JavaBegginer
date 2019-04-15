package Lesson_55;

public class MethodToString {

	public static void main(String[] args) {
		
		Podiya p = new Podiya(24, 8, 1991, "День Незалежності України");
		System.out.printf("%s%n", p);// метод toString() з java.lang.Object


		//якщо ми хочемо вивести значення об'єкта у вигляді String (текстовим рядком)
		//Java знає, що потрібно знайти в цьому класі і викликати метод "toString()"
		//якщо вона не зназодить метод "toString" в класі цього об'єкта
		//вона викликає метод "to string()" з суперкласу java.lang.Object
		//який повертає наступне: [ім'я класу + "@" + хеш об'єкта тіпа 32e6e9c3 ] - Lesson_55.Podiya@32e6e9c3
	}

}
