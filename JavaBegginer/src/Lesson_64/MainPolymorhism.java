package Lesson_64;

public class MainPolymorhism {

	public static void main(String[] args) {
		// Поліморфізм
		
		/*Тепер завдяки поліморфізму ми можемо зробити от так
		 * Tvaryna tk
		 * Tvaryna td
		 * ЧОму так згідно правил поліморфізму об'єкт який наслідує
		 * клас тварина в цьому пркладі може бути присвоєний у змінну 
		 * тіпа тварина*/
//		Tvaryna t = new Tvaryna();
		//Kit k = new Kit();
		//Drakon d = new Drakon();
		Tvaryna tk = new Kit();
		Tvaryna td = new Drakon();
		
	    Tvaryna[] tm = new Tvaryna[3];
	    tm[0] = new Tvaryna();
	    tm[1] = new Kit();
	    tm[2] = new Drakon();
	    
	    for (Tvaryna t : tm) {
	    	t.SkazatyPryvit();
	    }

	}

}
