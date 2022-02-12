package hw9Q3Abstraction;

//A regular class can inherit only one regular class or one abstract class by extends keyword
//A regular class can't inherit an Interface by extends keyword
public class ColumbiaUniversity extends MedicalSchool {

	// No we can not Create inside Regular class a abstract class.
	// public abstract void chemistry();
	public void biology() {
		System.out.println(" This class is from CplumbiaUniversity ");
	}

	// default Constructor
	public void ColumbiaUniversity() {
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
	}
}
