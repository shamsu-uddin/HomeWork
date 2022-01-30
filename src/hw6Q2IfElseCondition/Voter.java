package hw6Q2IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 43;

		if (age == 18) {
			System.out.println("My age is : " + age + " yes I'm a voter ");
		} else if (age < 18) {
			System.out.println("My age is : " + age + " I am not a voter yet");
		} else if (age > 18) {
			System.out.println("My age is : " + age + " I am a voter");
		} else {
			System.out.println("Please enter a valid age");
		}
	}
}
