package lesson_23;

public class StringType {

	public static void main(String[] args) {
		
		String text = "Привіт Java";
		int dovzh = text.length();//вона вкажить яка довжина нашого тексту скільки символів
		String a = "собака";
		String b = "барабака";
		String Text2 = "Привєт як ся маєш друже";
		
		
		System.out.println(dovzh);
		System.out.println(text.toUpperCase());//перевести букви в верхній реєстер
		System.out.println(text.toLowerCase());//перевести в нижній реєстер
		System.out.println(a + "-" + b);
		System.out.println(Text2.replace('є','і' ).replace('л', 'ш'));// заміна букви в тексті также сама за допомогою цього медоду можна замінити цілі слова
		System.out.println(Text2.indexOf('p'));//цей метод шукає порядковий номер букви у тексті
		
	}

}
