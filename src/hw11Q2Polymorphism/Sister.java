package hw11Q2Polymorphism;

public class Sister {
	// void type method is implemented
public void sister() {
	System.out.println("This is a void type method from Sister");
}
//void type parameterized method is implemented
public void  sister(int age1,int age2) {
	int total1= age1 + age2;
	System.out.println("Total area from Sister: " + total1);
}
//Return type parameterized method implemented 
public int sister(int age1,int age2, int age3) {
	int total2 = age1 + age2 + age3;
	System.out.println("Total area from Sister: " + total2);
	return total2;
}
// Return type parameterized method implemented
// but here one of the signature/parameter is String Type
public int sister(int age1, int age2, int age3, String age4) {
	int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
	System.out.println("Total area from Sister: " + total3);
	return total3;
}
//Return type parameterized method implemented 
public int sister(int age3, String age4, int age5, int age6) {
	int total4 = age3 + Integer.parseInt(age4) + age5 + age6;
	System.out.println("Total area from Sister: " + total4);
	return 4;
}
// Static type Method implemented
// Static method can be overloaded
public static int sister(int age1, int age2, int age3, int age5, int age6) {
	int total5 = age1 + age2 + age3 + age5 + age6;
	System.out.println("Total area from Sister: " +total5);
	return 5;
}
//Return type parameterized method which is final implemented 
public final int sister(int age1, int age2, int age3, int age5) {
	int total6 = age1 + age2 + age3 + age5;
	System.out.println("Total area from Sister: " + total6);
	return 6;
	
}














}
