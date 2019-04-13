package Lesson_46;

public class AutoDealer {

	public static void main(String[] args) {
		
		Car a1 = new Car();
		a1.vyrobnyk = "Mercedes";
		a1.model = "CLS";
		
		Car a2 = new Car();
		a2.vyrobnyk = "Ford";
		a2.model = "Mustang";
		
		System.out.println(a1.vyrobnyk);
		System.out.println(a2.vyrobnyk);
		
		a1.Beep();
		a2.Beep();
		
		Car a3 = new Car();
		a3.vyrobnyk = "Mercedes";
		a3.model = " E520";
		a3.tsina = 120000;
		a3.litrivNa100Km = 20;
		a3.rikVypusku = 2019;
		a3.rozmirBenzobaka = 80;
		a3.kolir = "Blac";
		
		System.out.println();
		System.out.println(a3.getFullInfo());
		System.out.println();
		System.out.println("Вартість за повний бак :" + a3.tsinaZaPovnyiBak(10) + " грн");

	}

}
