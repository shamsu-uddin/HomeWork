package hw7Q2IfElseCondition;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<--Please Enter your Hemoglobin A1C value below-->");
		Scanner scanner = new Scanner(System.in);
		double hbga1c = scanner.nextDouble();

		if (hbga1c > 6.4) {
			System.out.println(" I am a diabetic patien ");
		} else {
			if (hbga1c == 6.4) {
				System.out.println(" Congratulation! you are not diabetic ");
			} else if (hbga1c < 6.4 && hbga1c > 5.7) {
				System.out.println(" I am a pre-diabetic patient ");
			} else if (hbga1c < 5.7) {
				System.out.println(" I am a healthy person ");

			}

		}

	}

}
