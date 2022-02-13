package hw11Q3Abstraction;

//An abstract class can inherit only one abstract class or one regular class by extends key word
//An abstract class can't inherit an Interface by extends key word
public abstract class NursingSchool extends RockefellerUniversity {
	
	// This is mandatory to put abstract keyword with the abstract method in Abstract Class
	// This is the norm to write at least one abstract method inside abstract class
	public abstract void hygiene();

	// method implemented
	public void caring() {
		System.out.println("This class is from NursingSchool");
	}
}
