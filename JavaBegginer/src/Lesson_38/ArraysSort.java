package Lesson_38;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		/*Сортування масивів*/
		
		int [] array = {3,1,2,6,5,8};
		SortAndPrint(array);
		BubbleSort(array);

	}
	
	public static void SortAndPrint(int[] m)
	{
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		for (int i = m.length-1; i >= 0; i--)//цей цикл виводить масив задом на перед
			System.out.print(m[i] + " ");
		System.out.println("");//Цей фрагмент потрібен щоб перевести курсор на наступний рядок
	}

	/*!!!! Алгоритм - послідовність дій, які потрібно виконати щоб
	 * досягнути якогось результату*/
	
	/*Метод сортування бульбашкою*/
	
	public static void BubbleSort(int[] m)
	{
		int povtoriv = 0;
		boolean vidbulasZamina = true;
		while (vidbulasZamina)
		{
			vidbulasZamina=false;//ця змінна потрібна щоб котрьолювати чи потрібно пробігати по масиву щераз
				for (int i = 0; i<m.length-1-povtoriv; i++)
				{
					if (m[i]>m[i+1])
					{
						int tmp = m[i];
						m[i] = m[i+1];
						m[i+1] = tmp;
						vidbulasZamina = true;
					}
				}
				povtoriv++;
		}
		for(int i: m)
			System.out.print(i + " ");
	}
}
