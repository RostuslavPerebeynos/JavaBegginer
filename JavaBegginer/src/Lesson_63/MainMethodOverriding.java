package Lesson_63;

public class MainMethodOverriding {

	public static void main(String[] args) {
		// Заміщення методів
		
		Tvaryna t = new Tvaryna("Марина");
		Kit k = new Kit("Мурзік");
		Dragon d = new Dragon("Деенерис");
		
		System.out.println(t.SkazatyPryvit());
		System.out.println(k.SkazatyPryvit());
		System.out.println(d.SkazatyPryvit());

	}

}
