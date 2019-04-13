package Lesson_47;

public class Person {

	// поля або властивості класу Person
	private String imya;
	private String prizv;
	private int vik;
	private double zrist;
	private String profesiya;
	
	//щоб зробити інкапсуляцію, потрібно :
	//1. додати модифікатор private до нашого поля, і
	//2. створити 2 методи - getter & setter
	
	/**
	 * метод який повертає повне ім'я
	 * @return
	 */
	String getFullName() {
		return imya + " " + prizv;
	}
	/**
	 * метод який повртає повну інформацію про користовача
	 * @return
	 */
	String getFullInfo() {
		return getFullName() + " (вік: " + vik + "; зріст: " + zrist + " )";
	}
	
	// get (англ. "дістати")
	public String getImya() {
		return imya;
	}
	// set (англ. "встановити")
	/**
	 * Додамо перевірку чи довжина іменні більше 50 символів
	 * @param imya
	 */
	public void setImya(String imya) {
		if (imya.length()>50) {
			this.imya = imya.substring(0, 50);
		}
		else {
		this.imya = imya;//ключове слово "this" - в цьому випадку означає цей клас
		}
	}
	public String getPrizv() {
		return prizv;
	}
	public void setPrizv(String prizv) {
		this.prizv = prizv;
	}
	public int getVik() {
		return vik;
	}
	/**
	 * тепер за допомогою інкапсюляції ми можемо добавити перевірку
	 * до прикладу зараз зробимо щоб не можна було записати більше ніж 70 років
	 * в тому розомінні записати то зможе але програма більше ніж число 70 не видасть 
	 * в подальшому
	 * @param vik
	 */
	public void setVik(int vik) {
		if (vik>70) {
			this.vik = 70;
		}
		else {
			this.vik = vik;
		}
	}
	public double getZrist() {
		return zrist;
	}
	public void setZrist(double zrist) {
		this.zrist = zrist;
	}
	public String getProfesiya() {
		return profesiya;
	}
	public void setProfesiya(String profesiya) {
		this.profesiya = profesiya;
	}
	
	
}
