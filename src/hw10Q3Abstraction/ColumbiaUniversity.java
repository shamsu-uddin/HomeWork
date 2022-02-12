package hw10Q3Abstraction;

//A regular class can inherit only one regular class or one abstract class by extends keyword
//A regular class can't inherit an Interface by extends keyword

//implements keyword is used to inherit Interface in regular class
//a regular class can inherit more than one Interface by implements keyword
//a regular class cannot inherit a regular class or abstract class by implements keyword

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{

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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
}
