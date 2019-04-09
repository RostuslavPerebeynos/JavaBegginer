package Lesson_39;

public class VariableParamMethod {

	public static void main(String[] args) {
		
		/*Методи зі змінною кількістю параметрів*/
		
		System.out.println(VyrakhuvatySerednie(1,2,3,4,5));
		System.out.println(VyrakhuvatySerednie(23,5,56,23,65,567,2,4,5,6));
		

	}
	
	public static double VyrakhuvatySerednie(int...number) // те що в дужках означає що ми можемо передати будь яку кількість параметрів які джава прийдеться опрацювати
	{
		int suma = 0;
		for(int i: number)
			suma+=i;
		return (double)suma/(double)number.length;//тут те що в дужках ми зробили конвертацію з цілих чисел на double
	}

}
