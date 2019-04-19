package Lesson_64;
/**
 * Треба пам'ятати таку важливу річ що при наслідуванні 
 * поля private не наслідуються тобто якщо в тварина були прайвет
 * поля то клас кіт їх не унаслідує
 * @author Ростислав
 *
 */
public class Kit extends Tvaryna {

	public void Murknuty() {
		System.out.println("Мур - мур");
	}
	//тепер клас кіт є морфізмом класу тварина
	@Override
	public void SkazatyPryvit() {
		System.out.println("Кіт каже ПРИВІТ");
	}
	
}
