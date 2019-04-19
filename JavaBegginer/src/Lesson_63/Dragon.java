package Lesson_63;

public class Dragon extends Tvaryna{

	public Dragon(String name) {
		super(name);
	}
	
	@Override // цю мітку бажано ставити це означає що той метод є заміщеним і так буде легше для інший програмістів читати 
	public String SkazatyPryvit() {
		return String.format("Дракон %s з вогнем кричить привіт", super.getName());
	}

}
