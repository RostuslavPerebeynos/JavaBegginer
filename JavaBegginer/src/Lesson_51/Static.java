package Lesson_51;
/**
 * Для того щоб викликати статичне поле класу ми використовуємо не сам об'єкт
 * в нашому випадку c1 а використовуємо безпосередньо клас ім'я класу Client
 * 
 * І Для того щоб викликати статичне поле класу не обов'язково створювати об'єкт
 * 
 * З статичного метода не можна викликати не статичне поле або не статичний метод а
 * навпаки можна тобто статичні поля і методи можуть бути викликані з нестатичного методу
 * 
 * Статичні поля і методи доступні з будь-якого місця програми і в будь який момент
 * @author Ростислав
 *
 */
public class Static {

	public static void main(String[] args) {
		
		/*Static*/
		
	//	Client c1 = new Client("Джеймс", "Бонд");
		//c1.kilkist = 1; -- це поле є статичним і такий виклик не є правильним
		
	//	Client.kilkist = 1; // це правильний спосіб
		
		System.out.println(Client.kilkist);
		
		String firstName = "Джеймс", lastName = "Бонд";
		if (Client.ChyMozhnaStvoryty(firstName, lastName)) {//в такий спосіб використовуючи статичний метод ми можемо вберегти себе від створення не бажаного об'єкту
			Client c1 = new Client(firstName,lastName);     //а без статичного методу нам би прийшлось створювати новий об'єкт і потім провіряти це об'єкт 
		} else {
			System.out.println("Згідно правил, не можна створити користувача з такою кількістю букв");
		}
		
		Client c2 = new Client("Тарас", "Бульба");
		Client c3 = new Client("Вася", "Бонд");
		AddMoreClient();
		System.out.println(Client.kilkist);

	}
	
	public static void AddMoreClient() {
		Client c4 = new Client("Дмитро", "Бонд");
		Client c5 = new Client("Іван", "Бульба");
		Client c6 = new Client("Юзик", "Бонд");
	}

}
