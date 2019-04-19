package Lesson_63;

public class Tvaryna {

	private String name;

	public Tvaryna(String name) {
		super();
		this.name = name;
	}
	
	public String SkazatyPryvit() {
		return String.format("Тварина %s каже привіт", this.name);
	}
	public String getName() {
		return this.name;
	}
}
