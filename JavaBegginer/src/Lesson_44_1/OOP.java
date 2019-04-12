package Lesson_44_1;

public class OOP {

	public static void main(String[] args) {
		
		/*Це все що ми до тепер програмували це було Процедурне
		 * програмування тепер приступемо до ООП*/

		Student st = new Student();
		
		st.setFirstName("Микола");
		st.setLastName(" Динозавр");
		st.setVik(550);
		st.setVaga(1250.5);
		
		System.out.println(st.GetFullInfo());
	}

}
