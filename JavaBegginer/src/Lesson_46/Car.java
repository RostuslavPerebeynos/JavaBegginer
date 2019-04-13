package Lesson_46;
/**
 * Клас для зберігання інформації автомобіль
 * @author Ростислав
 *
 */
public class Car {

	// поля класу - описують стан об'єкта цього класу
	String vyrobnyk;
	String model;
	int rikVypusku;
	String kolir;
	double tsina;
	boolean vidkydnyiDakh;
	int litrivNa100Km;
	int rozmirBenzobaka;
	int vaga;
	
	/**
	 * Цей метод заставляє автомобіль сигналити
	 */
	public void Beep() {
		System.out.println(vyrobnyk + "" + model + " бібікнув ");
	}
	/**
	 * Це метод який повертає повну інформацію про автомобіль
	 * @return
	 */
	public String getFullInfo() { 
		return vyrobnyk + " " + model
				+ "(" + kolir + ")\n"
				+ " $" + tsina + "\n"
				+ " " + litrivNa100Km +" літрів на 100 км, бак: "
				+ rozmirBenzobaka + "л\n";
	}
	/**
	 * Метод визначає скільки буде коштувати за повний бак
	 * @param tsinaZaLitr
	 * @return
	 */
	double tsinaZaPovnyiBak(double tsinaZaLitr) {
		return tsinaZaLitr* rozmirBenzobaka;
	}
	double getNaskilkyvystachytBenzynu(double kilkistBenzynuVbatsi) {
		return (int)(100*(double)kilkistBenzynuVbatsi/(double)litrivNa100Km);
	}
	int getMaxDistance() {
		return (int)(100*(double)rozmirBenzobaka/(double)litrivNa100Km);
	}
}
