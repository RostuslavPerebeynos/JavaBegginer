package Lesson_29;

public class VidsotokNaDepozyt {

	public static void main(String[] args) {
		
		double vklad = 1000, vidsotok = 0.2, balans = 0;
		int rikVklady = 2017;
		
		for (int rik = rikVklady; rik <=rikVklady + 10; rik ++)
		{
			balans = vklad * Math.pow(1 + vidsotok, (rik - rikVklady + 1)); //pow піднесення до степеню
			System.out.println("Баланс на кінець " + rik + " року: " + balans);
		}

	}

}
