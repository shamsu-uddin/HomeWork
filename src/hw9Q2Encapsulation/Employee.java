package hw9Q2Encapsulation;

public class Employee {
	private String emName;
	private int emAge;
	private char emSex;
	private boolean usCitizen;

	public String getEmName() {
		return emName;
	}

	public void setEmName(String emName) {
		this.emName = emName;
	}

	public int getEmAge() {
		return emAge;
	}

	public void setEmAge(int emAge) {
		this.emAge = emAge;
	}

	public char getEmSex() {
		return emSex;
	}

	public void setEmSex(char emSex) {
		this.emSex = emSex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
