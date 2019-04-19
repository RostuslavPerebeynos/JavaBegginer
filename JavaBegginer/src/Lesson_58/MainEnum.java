package Lesson_58;
import java.time.LocalDateTime;
/**
 * Enum він існує для створення зміних які є постійними і незмінними
 * Enum - це спеціальний класн який містить набір констант або постійних значень
 * повинній бути записані через кому
 * Поля класів enum за замовчуванням є статичними і файнал 
 * Enum ще зрусний тим що коли програміст вів щось неправильно компилятор зразу 
 * висвітлить цю помилку
 */
public class MainEnum {

	public static void main(String[] args) {
		/*Перелічування ENUM*/
		
		for (Colir k : Colir.values()) {//values() - він викине всі кольори
			System.out.printf("%s %s%n", k, k.getRGB());
		}
		
		
//		Colir k = Colir.RED;
//		if (k == Colir.RED) {
//			System.out.println("Колір - червоний");
//		} else {
//			System.out.println("Колір не червоний");
//		}
//		
		
		switch (getPoraRoku()) {
		case ZYMA:
			System.out.println("Вдягайтеся тепло");
			break;
		case VESNA:
			System.out.println("Вдягайтеся по - весняному");
			break;
		case LITO:
			System.out.println("Вдягайтеся легко");
			break;
		case OSIN:
			System.out.println("Вдягайтеся в дощовик");
			break;
		}

	}
	//Є така практика серед програмістів що якщо метод щось повертає то його назву починають з get
	public static PoryRoku getPoraRoku() {
		
		LocalDateTime now = LocalDateTime.now();//коли ми його викличемо він нам поврне дату час місяць
		int m = now.getMonthValue();//цей метод поверне нам тільки місяць
		switch (m) {
		case 1:
		case 2:
		case 12:
			return PoryRoku.ZYMA;
		case 3:
		case 4:
		case 5:
			return PoryRoku.VESNA;
		case 6:
		case 7:
		case 8:
			return PoryRoku.LITO;
		case 9:
		case 10:
		case 11:
			return PoryRoku.OSIN;
			default:
				return PoryRoku.NEVIDOMA;
				
			
		}
	}
}
