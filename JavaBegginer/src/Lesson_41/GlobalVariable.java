package Lesson_41;

public class GlobalVariable {
	
	public static int kava = 0;
	public static final double vidsotok = 10;// final не позволить змінити відсоток ніяк

	public static void main(String[] args) {
		
		/*Глобальні змінні - вони знаходяться не в медоті
		 * а на рівні класу і після цього кожен метод в 
		 * цьому класі буде знати про неї*/
		
		/*УВАГА В JAVA термін глобальна змінна взагаліто не існує
		 * точніше її називають Змінна Класу або Статичним полем класу */
		
		System.out.println(kava);
		kava = 1;
		System.out.println(kava);
		DodatyKavy();
		System.out.println(kava);
		VypytyKavy();
		System.out.println(kava);
//__________________________________________
		double number =25;
		System.out.println(number/100 * vidsotok);

	}
	public static void DodatyKavy()
	{
		kava++;
	}
	public static void VypytyKavy()
	{
		kava=0;
	}

}
