package Lesson_40;

public class VariableScope {

	public static void main(String[] args) {
		/*Області видимості змінної*/
		
		/*В java область вилимості змінної обмежується хвилястими
		 * дужками в якій ця змінна є об'явленна*/
		
		int moloko = 1;
		
		if (moloko ==1)
		{
			String rezultat = "moloko";
			System.out.println(rezultat);
		}
		else
		{
			int rezultat = 123;
			System.out.println(rezultat);
		}

	}
	public static void Kotygoroshko()
	{
		String moloko = "два";
	}
	public static void Rahkuvalka (double moloko)
	{
		moloko = moloko * 2;
	}

}
