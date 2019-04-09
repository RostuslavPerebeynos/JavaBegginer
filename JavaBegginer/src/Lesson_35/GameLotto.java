package Lesson_35;

import java.util.Random;
import java.util.Scanner;

public class GameLotto {

	public static void main(String[] args) {

		//1 отримати введення від користувача
		String[] chyslaVidKorystuvach = OtrymatyVvedennyaVidKorystuvacha();
		//2 провести розіграш
		int[] tsejRozigrash = ProvestyRozigrash();
		//крок 3 - перевірити числа від користувача на співпадіння з виграшу
		int ikilkistSpivpadin = PerevirytyRezultat(chyslaVidKorystuvach, tsejRozigrash);
		//крок 4 вивести результат
		String vsiChyslaRozigrashu = KonvertyvatyMasyvVText(tsejRozigrash);		
		
		System.out.println("У розіграші співпало (" + vsiChyslaRozigrashu +"): " + ikilkistSpivpadin);
		
	}
	
	public static String[] OtrymatyVvedennyaVidKorystuvacha()
	{
		//крок 1 - отримати введення від користовача
				System.out.println("Введіть 6 чисел (від 1 до 54): ");
				Scanner scan = new Scanner(System.in);
				/*тепер ми зчитаємо всі ці числа в текстовий рядок*/
				String chysla = scan.nextLine();
				scan.close(); //Ми закрили об'єкт сканер щоб це не призвило до втрати памяті
				              //Іншими словами ми закрили Сканер і очистили його з пім'яті
				
				String[] strMasyvVvedenyhChysel = chysla.split(",");
				/*"Оператор split" Що це означає якщо в нас є текст який містить коми то він розіб'є це на масив
				 * Якщо після числа 1 внас є кома то число 1 буде першгий елемент масиву і так далі*/
				// "1,24,17,45,11,7" -> split(",") -> String[] a = {"1","24","17","45","11","7"}
				// є нюанс якщо користувач замість цифри введе букву то воно також поверне масив цієї букви)))
				
				return  strMasyvVvedenyhChysel;
	}

	public static int [] ProvestyRozigrash()
	{
		//крок 2 - провести розіграш
				int [] tsejRozigrash = new int[6]; // В цей масив будемо записувати тільки виграшні номери останнього тиражу(розіграшу)
				Random r = new Random();
				int iChysloRozigrashu = 0;
				while (iChysloRozigrashu!=6)
				{
					boolean chysloVzheIsnuje = false;
					int tseChyslo = r.nextInt(54)+1;// мусіли додати одиницю щоб випало число від 1 до 54 
					tsejRozigrash[iChysloRozigrashu++] = tseChyslo;
					/*тепер ми використаємо вдосконалений цикл for щоб генератор 
					 * випадкових чисел не викидав одинакові числа*/
					for (int isnujucheChyslo: tsejRozigrash)
					{
						if(isnujucheChyslo==tseChyslo)
						{
							chysloVzheIsnuje = true;
							break;
						}
					}
					if (chysloVzheIsnuje!=true)
					{	
						tsejRozigrash[iChysloRozigrashu++] = tseChyslo;
					}
				}
				
				return tsejRozigrash;
	}

	public static int PerevirytyRezultat(String[] strMasyvVvedenyhChysel, int[] tsejRozigrash)
	{
		int ikilkistSpivpadin = 0;
		for (int k=0; k<strMasyvVvedenyhChysel.length; k++)
		{
			int chyslo = Integer.parseInt(strMasyvVvedenyhChysel[k]);
			for (int tseVygrashneChyslo : tsejRozigrash)
			{
				if(chyslo == tseVygrashneChyslo)
				{
					ikilkistSpivpadin++;
				}
			}
		}
		return ikilkistSpivpadin;
	}

	public static String KonvertyvatyMasyvVText(int[] chysla)
	{
		String vsiChyslaRozigrashu = "";
		for (int Chyslo: chysla)
		{
			vsiChyslaRozigrashu = vsiChyslaRozigrashu + Chyslo + " ";
		}
		
		return vsiChyslaRozigrashu;
		
		
		
	}
	
	{
		
				
	}
}
