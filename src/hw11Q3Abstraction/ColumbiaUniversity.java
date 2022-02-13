package hw11Q3Abstraction;

import java.security.PublicKey;

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
		System.out.println("This method is from ColumbiaUniversity class");
	}

	@Override
	public void anatomyLab() {
		System.out.println("This anatomyLab from MedicalSchool abstract class");
	}

	@Override
	public void hygiene() {
		System.out.println("This hygiene from NursingSchool abstract class");
	}

	@Override
	public void commonRoom() {
		System.out.println("This commonRoom from College interface class");
	}

	@Override
	public void laboratory() {
		System.out.println("This laboratory from College interface class");
	}

	@Override
	public void languageClub() {
		System.out.println("This languageClub from College interface class");
	}

	@Override
	public void emergencyRoom() {
		System.out.println("This emergencyRoom from Hospital interface class");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("This surgeryRoom from Hospital interface class");
		
	}

	@Override
	public void cafeteria() {
		System.out.println("This cafeteria from Hospital interface class");
		
	}

	@Override
	public void lawInfo() {
		System.out.println("This lawInfo from LawSchool interface class");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("This vocationalInfo from VocationalSchool interface class");
		
	}

	@Override
	public void classSize() {
		System.out.println("This classSize from University interface class");
		
	}

	@Override
	public void playGround() {
		System.out.println("This playGround from University interface class");
		
	}

	@Override
	public void teacher() {
		System.out.println("This teacher from University interface class");
	 }
	public static void name() {
		System.out.println("This is a static method from ColumbiaUinversity");
		
	}
}
