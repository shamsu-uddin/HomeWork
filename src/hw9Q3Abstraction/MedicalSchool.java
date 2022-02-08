package hw9Q3Abstraction;

// abstract class can inherit only one abstract class or one regular class by extends key word.
public abstract class MedicalSchool extends NursingSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This class is from MedicalSchool ");
	}
    // Yes, an abstract class can have a constructor
	public void MedicalSchool() {
	}
}
