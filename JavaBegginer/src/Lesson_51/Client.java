package Lesson_51;

public class Client {

	private String firstName;
	private String lastNema;
	
	static int kilkist = 0;
	
	//та локіка поялє в тому чи можемо створити користувача до того а не після
	static boolean ChyMozhnaStvoryty(String firstName, String lastNema) {
		return firstName.length()<10; //Якщо ім'я менше 10 букв то true можна створити об'єкт в іншому випадку false
		
	}
	
	public Client(String firstName, String lastNema) {
		super();
		this.firstName = firstName;
		this.lastNema = lastNema;
		kilkist++; //це означпє що коли ми ствоємо новий о.єкт класу client це автоматично збільшує на одиницю
		System.out.println("oб'єкт " +firstName+" створено");
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNema() {
		return lastNema;
	}

	public void setLastNema(String lastNema) {
		this.lastNema = lastNema;
	}

	
	
}
