package Lesson_67;

public abstract class Strava {

	public void Zgotuvaty() {
		System.out.println("Страву зготовано");
	}
	
	// абстрактний метод
	// обов'язково повинен бути заміщений у дочірньому класі
	// (це правило Джави)
	public abstract void Rozigrity();
}
