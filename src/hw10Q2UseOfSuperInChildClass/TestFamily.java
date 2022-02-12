package hw10Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		System.out.println("\n---------- default constructor initialized for Daughter Class ----------");
		Daughter daughter1 = new Daughter();

		System.out.println("\n--------- parameterized constructor initialized for Daughter Class ----------");
		Daughter daughter2 = new Daughter("January", 12);

		System.out.println("\n---------- void type method initialized for Daughter Class ----------");
		daughter2.daughter();

		System.out.println("\n---------- parameterized method initialized for Daughter Class ----------");
		daughter2.daughterInfo("May", 7);

		System.out.println("\n---------- default constructor initialized for Father Class ----------");
		Father father = new Father();

		System.out.println("\n---------- parameterized constructor initialized for Father Class ----------");
		Father father1 = new Father();
		father.fatherInfo("Joynal", 65, 'M', false);

		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father1.father();

		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
		father1.fatherInfo("Shamsu", 45, 'M', true);
	}
}