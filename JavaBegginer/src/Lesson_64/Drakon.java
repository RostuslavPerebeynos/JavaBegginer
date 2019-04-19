package Lesson_64;

public class Drakon  extends Tvaryna{
    /*Поліморфізм це коли підклас може мати свої методи
     * і поля але в той же час мати певну успадковану функціональність
     * з батьківського класу*/
	
	@Override
	public void SkazatyPryvit() {
		System.out.println("Дракон каже Привіт");
	}
	public void MahnutyKrylamy() {
		System.out.println("Дракон махнув крилами");
	}
}
