package hw11Q3Abstraction;

//A regular class can inherit only one regular class or one abstract class by extends keyword
public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {

	// method is implemented inside class, not declared
	// also called non abstract method
	public void maths() {
		System.out.println("This is From RockefellerUniversity class");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}
}
