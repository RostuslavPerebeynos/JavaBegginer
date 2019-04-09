package Lesson_34;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		      /*Багато вимірний масив*/

		/*Масив - це об'єкт, в який можна записати більше
		 * ніж одне значення (того ж самого типу).
		 * Розмір масиву задається під час ініціалізації
		 * змінної масиву.*/
		
		int [] number = {123, 3424, 2234}; // одновимірний масив
		number[1] = 1;
		
		System.out.println(number[1]);
		
		int [][] dvovymirnyi = {
				/*0*/{1, 25},
				    /*0*/  /*1*/  /*2*/   /*3*/  /*4*/
				/*1*/{2,    67,    777,    81,    999},
				/*2*/{5, 33, 2}
		};
		
		System.out.println(dvovymirnyi[1][2]);
		
		for (int ryad = 0; ryad<dvovymirnyi.length; ryad++) //цикл необхідний щоб висти все
		{
			for (int stovp = 0; stovp<dvovymirnyi[ryad].length; stovp++)
			{
				System.out.println(dvovymirnyi[ryad][stovp]);
			}
		}
		
		String[][] slova = new String[3][];
		slova[1] = new String[] {"вода", "молоко", "", "сік"};
		System.out.println(slova[1][1]);// виведе молоко
		
		/*________________________________________________________*/
		
		int [][] lotto = {
				{12,34,56,78,90,33,643},
				{1234,55678,23,567,832},
				{3452,3,1,2,6,8,9,3333},
				{897,0,518,422,498,111}
		};
		
		for (int i = 0; i<lotto.length; i++)
		{
			int sumaChyselRozigrashu = 0;
			for (int chyslo: lotto[i])
			{
				sumaChyselRozigrashu=sumaChyselRozigrashu+chyslo;
			}
			System.out.println("Сума чисел розіграшу № " + i + ": " + sumaChyselRozigrashu + "; \n");
			System.out.println("Середнє розіграшу №" + i + ": " + sumaChyselRozigrashu/lotto[i].length);
		}
	}

}
