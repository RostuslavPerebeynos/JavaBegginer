package Lesson_63;

public class Kit extends Tvaryna {

	public Kit(String name) {
		super(name);// в цьому це означає викликати підходячий метод батьківського класу
					// коли ми викликаємо конструктор класу kit він викликає батьківський конструктор класу тварина
	}

	/**
	 * Це свого роду і є заміщення ми з батьківського мутоду скопієвали 
	 * вставили в Kit добавили м'яууу але ми не можу тут використати
	 * this.name то що робимо ми в батьківському методі створюємо метод 
	 * getName який повертатиме this.name і тепер тут ми викличемо super 
	 * тобто викличемо метод батьківського класу  super.getName()
	 */
	@Override // цю мітку бажано ставити це означає що той метод є заміщеним і так буде легше для інший програмістів читати 
	public String SkazatyPryvit() {// І треба знати що якщо ми в круглі дужки добавили якіьс параметри "String name" то це вже не заміщення а перевантаження методу це треба розоміти і тоді треба забрати ту анотацію і все 
	//	return String.format("Тварина %s каже привіт, м'яуууу", super.getName());
	   return super.SkazatyPryvit()+ ", м'яууу"; // ще можна так записати метод super тут викликає батьківський метод і ми добавили до нього м'яууу
	}
}