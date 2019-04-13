package Lesson_45;

public class FirstOOPClass {

	public static void main(String[] args) {
		
		// створити новий об'єкт класу/типу "Box" в пам'яті комп'ютера
		Box myBox = new Box();
		myBox.width = 2; // крапка це оператор яка дає можливості викликати якісь поля або можливості класу
		myBox.height = 3;
		myBox.length = 4;
		
		
		/*double obyem = myBox.height*myBox.length*myBox.width;
		System.out.println(obyem);*/
		
		double obyem = myBox.Obyem();
		System.out.println(obyem);
		
		Box myBox2 = new Box();
		myBox2.width = 3; 
		myBox2.height = 32;
		myBox2.length = 45;
		System.out.println(myBox2.Obyem());
		
	}

}
