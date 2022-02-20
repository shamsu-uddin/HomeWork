package hw11Q2Polymorphism;

public class Niece extends Sister {

	// method-1
	@Override
	public void sister() {
		System.out.println("This is a void type method from Niece");
	}

	// method-2
	@Override
	public void sister(int age1, int age2) {
		int total1 = age1 + age2 + 25;
		System.out.println("Total area from Niece: " + total1);
	}

	// method-3
	@Override
	public int sister(int age1, int age2, int age3) {
		int total2 = age1 + age2 + age3 - 10;
		System.out.println("Total area from Niece: " + total2);
		return total2;
	}

	// method-4
	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4) * 2;
		System.out.println("Total area from Niece: " + total3);
		return total3;
	}

	// method-5
	@Override
	public int sister(int age3, String age4, int age5, int age6) {
		int total4 = age3 + Integer.parseInt(age4) + age5 / 2 + age6;
		System.out.println("Total area from Niece: " + total4);
		return 4;
	}
	/*
	// method-6
	// So, static method can't be override, if we remove @override it will work as
	// static method of this Niece class
	@Override
	   public static int sister(int age1, int age2, int age3, int age5, int age6) { 
       int total5 = age1 + age2 + age3 + age5 + age6;
	   System.out.println("Total area from local Niece: " +total5); 
	    return 5; 
	 }
	/*
	  // method-7 
	  // Final type method cannot be Overriden 
	   // Cannot override the final method from Sister
	 @Override 
	  public final int sister(int age1, int age2, int age3, int age5) {
	  int total6 = age1 + age2 + age3 + age5;
	  System.out.println("Total area from local Niece: " + total6); 
	  return 6; 
	 */
}
