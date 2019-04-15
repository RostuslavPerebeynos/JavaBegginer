package Lesson_55;

public class Podiya {

	private int den;
	private int misyats;
	private int rik;
	private String podiya;
	
	public Podiya(int den, int misyats, int rik, String podiya) {
		super();
		this.den = den;
		this.misyats = misyats;
		this.rik = rik;
		this.podiya = podiya;
	}
	
	@Override
	public String toString() { // цей метод який можна автоматично згенерувати необхдний щоб вивести об'єкт в гословному класі нормально а не от так Lesson_55.Podiya@32e6e9c3
/*автоматично*///return "Podiya [den=" + den + ", misyats=" + misyats + ", rik=" + rik + ", podiya=" + podiya + "]";
/*або вручну */ return String.format("%d/%d/%d - %s" , den, misyats, rik, podiya);		
	}
	
}
