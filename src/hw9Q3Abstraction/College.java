package hw9Q3Abstraction;

//An Interface can inherit more than one Interface by extends keyword
//An Interface can't inherit a regular class or an abstract class by extends keyword

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void dorm() {
	}
	public static void studyRoom() {
	}
}
