package hw6Q2IfElseCondition;

public class Voter {
//https://github.com/shamsu-uddin/HomeWork.git
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Please enter your age");
//		byte age = scn.nextByte();
		int age = 43;
		if (age == 18) {
			System.out.println("My age is : " + age + " yes I'm a voter ");
		} else if (age < 18) {
			System.out.println("My age is : " + age + " I am not a voter yet");
		} else if (age >= 18) {
			System.out.println("My age is : " + age + " Hurray! I am a voter");
		} else {
			System.out.println("Please enter a valid age");
		}

	}
}

/*
 * 
 * a) your age is equal to 18, outcome will be "I am a Voter" b) your age is
 * less than 18, outcome will be
 * "I am not a Voter c) your age is greater than 18 or equal to 18 , outcome will be "
 * I am a Voter (>=) d) And finally the outcome will be
 * "Please enter a valid age". In the above 4 condition, use appropriate key
 * word like if, else if, else to execute that you are a voter or not.
 * 
 */