package Lesson_19;

public class Return {


	public static void main(String[] args) {
		
		String rezult = SayHi("Bob");
		System.out.println(rezult);
		
		Nuthig();
		int number = PovernuNumber();
		System.out.println(number);
		String text = PovernuText();
		System.out.println(text);
		
		int suma = Suma(5, 12);
		System.out.println(suma);

	}

	public static String SayHi(String name) {
		String text = "Привіт, " + name;
		return text;
	}
	public static void Nuthig()
	{
		System.out.println("Я не повертаю нічого");
	}
	public static String PovernuText()
	{
		//return "Якісь текст";або можна так
		String text = "якийсь текст";
		return text;
	}
	public static int PovernuNumber()
	{
		return 5;
	}
	public static int Suma(int a, int b)
	{
		int sumaNumber = a + b;
		return sumaNumber;
	}

}
