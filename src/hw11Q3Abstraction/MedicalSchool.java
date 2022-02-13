package hw11Q3Abstraction;

// abstract class can inherit only one abstract class or one regular class by extends key word.
//implements keyword is used to inherit Interface in abstract class
//an abstract class can inherit more than one Interface
//an abstract class cannot inherit a regular class or abstract class by implements keyword

public abstract class MedicalSchool extends NursingSchool  implements LawSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This class is from MedicalSchool ");
	}
    // Yes, an abstract class can have a constructor
	public void MedicalSchool() {
	}
	public static void nySchool() {
		System.out.println("This is static from MedicalSchool abstract Class");
	}
}
