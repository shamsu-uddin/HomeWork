package hw8Q3Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This class is from MedicalSchool ");
	}
    // Yes, an abstract class can have a constructor
	public void MedicalSchool() {
	}
}
