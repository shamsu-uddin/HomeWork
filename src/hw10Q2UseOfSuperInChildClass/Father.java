package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default constructor
	public Father() {
		System.out.println("This is a default constructor from Father Class");
	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name:" + name + " Age " + age + " Sex " + sex + " UsCitizen " + usCitizen);
	}

	// void type method
	public void father() {
		System.out.println("This is a void type method from father Cless");
	}

	// parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name:" + name + " Age " + age + " Sex " + sex + " UsCitizen " + usCitizen);
	}
}
