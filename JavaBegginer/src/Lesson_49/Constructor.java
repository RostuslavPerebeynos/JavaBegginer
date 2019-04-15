package Lesson_49;

public class Constructor {

	public static void main(String[] args) {
		
		/*Конструктор*/
		
		Smarthone i7 = new Smarthone("Sumsung", true, 135);
		System.out.println(i7.getBrandName());
		System.out.println(i7.isNew());
		System.out.println(i7.getTsina());

	}

}
