package Lesson_48;
/**
 * Перевантаження методів - це один засобів реалізації поліморфізму
 * Вимоги :
 * 1. усі перевантажі методи повинні мати однакову ім'я
 * 2. усі перевантажі методи повинні відрізнятися ""сигнатурою метода" тобто 
 * цією чатсиною : (int a, int b).......
 * @author Ростислав
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {
		/*Перевантаження методів*/
		
		System.out.println(Dodaty(1,2));
		System.out.println(Dodaty(1,2,3));
		System.out.println(Dodaty("cjsdvfvv", "sdfjsdkv"));

	}
	// Для джави різна кількість параметрів в мутодах означає що ці методи є різні і немає значення що вони одинаково називаються
	//і ці два методи називають перевантажені методи анг. Overloading
	public static int Dodaty(int a, int b) {
		return a + b;
	}
	
	public static int Dodaty (int a, int b, int c) {
		return a + b + c;
	}
	
	public static double Dodaty(double a, double b) {
		return a + b;
	}
	
	public static String Dodaty (String a, String b) {
		return a + b;
	}
	
	public static void Dodaty() {}
	
	public static int Dodaty (int[] iArray) {
		int sum = 0;
		for (int i : iArray) {
			sum+=i;
		}
		return sum;
	}
}
