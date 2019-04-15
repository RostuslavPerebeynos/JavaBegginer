package Lesson_53;
/**
 * В ООП успадкування(наслідування) - мезанізм утсворення нових
 * класів на основі використання вже існуючих.
 * При цьому вдастивості та функціональність батьківського класу
 * переходять до класу нащадка(дочірнього).
 * Для того, щоб поля/методи суперкласу були доступними в дочірному класі,
 * вони повинні мати модифікатор public
 * @author Ростислав
 *
 */
public class MainInheritance {

	public static void main(String[] args) {
		
		/*Успадкування або наслудування*/
		
		Dynozar d = new Dynozar();
		System.out.printf("Динозавр каже  %s\n", d.pryvyit());
		Korova k = new Korova();
		System.out.printf("Корова каже  %s%n", k.pryvyit());
		Metelyk m = new Metelyk();
		System.out.printf("Mетелик каже %s", m.HiMyFriends());
	}

}
