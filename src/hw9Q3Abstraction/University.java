package hw9Q3Abstraction;

// Interface can inherit more than one Interface by extends keyword
// Interface can't inherit a regular class or an abstract class by extends keyword

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	// public void university() {
	// }
	// you cannot have a constructor within an interface in Java

	public default void gymnasium() {
	}

	public static void library() {
	}
}