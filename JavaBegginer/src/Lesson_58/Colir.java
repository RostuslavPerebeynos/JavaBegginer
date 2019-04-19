package Lesson_58;

public enum Colir {

	RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255), YELLOW(255,255,0);
	
	private int red, green, blue;
	
	private Colir(int r, int g, int b) {
		red = r; green = g; blue =b;
	}
	public String getRGB() {
		return String.format("(%s,%s,%s)", red, green, blue);
	}
}
