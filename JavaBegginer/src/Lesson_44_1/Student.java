package Lesson_44_1;

public class Student {

	private String FirstName;
	private String LastName;
	private int Vik;
	private double Vaga;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getVik() {
		return Vik;
	}
	public void setVik(int vik) {
		Vik = vik;
	}
	public double getVaga() {
		return Vaga;
	}
	public void setVaga(double vaga) {
		Vaga = vaga;
	}
	public String GetFullInfo () {
		return FirstName + "" + LastName
				+ "\nВік: " + Vik
				+ "\nВага: " + Vaga;
	}
	 
}
