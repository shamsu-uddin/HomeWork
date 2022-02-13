package hw11Q3Abstraction;

// Interface can inherit more than one Interface by extends keyword
// Interface can't inherit a regular class or an abstract class by extends/implements keyword

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	// you cannot have a constructor within an interface in Java
	//public void University() {
	//}
	public default void gymnasium() {
		System.out.println("gymnasium from University Interface");
	}

	public static void library() {
		System.out.println("library from  Interface");
	}
}