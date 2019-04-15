package Lesson_49;

public class Smarthone {

	private String brandName;
	private boolean isNew; // true = тел. новий, false = тел. б/у
	private double tsina;
	
	//1. Назва методу-конструктор обов'язково повинна співпадати з назвою вашого класу
	
	public Smarthone(String brandName, boolean isNew, double tsina) {
		super();
		this.brandName = brandName;
		this.isNew = isNew;
		this.tsina = tsina;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public double getTsina() {
		return tsina;
	}
	public void setTsina(double tsina) {
		if (tsina<0) {
			this.tsina = 0;
		}
		else {
			this.tsina = tsina;
		}
	}
	
	
}
