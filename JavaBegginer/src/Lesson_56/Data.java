package Lesson_56;

public class Data {

	private int den;
	private int misyats;
	private int rik;
	
	public Data(int den, int misyats, int rik) {
		super();
		this.den = den;
		this.misyats = misyats;
		this.rik = rik;
	}

	@Override
	public String toString() {
		return String.format("%s/%s/%s", den, misyats, rik);
	}
	
	
	
}
