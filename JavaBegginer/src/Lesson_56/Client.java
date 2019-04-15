package Lesson_56;

/**
 * От нище ми здіснили композицію - це коли змінна (об'єкт) одного класу є
 * полем іншого класу 
 * І тепер замість чотирьох полів є два стало охайняше це і є композиція
 * @author Ростислав
 *
 */
public class Client {

	private String imya;
//	private int denNar;
//	private int misyatsNar;
//	private int rikNar;
	private Data dataNarodzhennya;
	private Data dataReyestratsiyi; // і тепер клас дата можна використати повторно
	                                // а якби ми не зробили ту композицію то в нас би вже було цілих 7 рядків)))
	
	public Client(String imya, Data dataNarodzhennya) {
		super();
		this.imya = imya;
		this.dataNarodzhennya = dataNarodzhennya;
	
	
}

	@Override
	public String toString() {
		return String.format("Ім'я: %s%nДата народження:%s", imya, dataNarodzhennya);
	}
	
	

	
	
}
