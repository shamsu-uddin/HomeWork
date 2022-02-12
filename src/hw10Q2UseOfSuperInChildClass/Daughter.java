package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	// default constructor
	public Daughter() {
		super();
		// super keyword is used to call (initialize) the variables of parent class
		super.familyName = "Uddin";
		System.out.println("FamilyName: " + familyName);
		System.out.println("This is a default constructor from Daughter Class");
	}

	// parameterized constructor
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth:" + birthMonth + " Age " + age);
	}

	// void type method
	public void daughter() {
		System.out.println("This is a default method from daughter Class");
	}

	// parameterized method
	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("BirthMonth:" + birthMonth + " Age " + age);
	}
}
