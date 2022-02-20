package hw11Q2Polymorphism;

public class TestFamily {
public static void main(String[] args) {
	System.out.println("\n---------Sister----------");
	Sister sis = new Sister();
sis.sister();
sis.sister(25, 20);
sis.sister(15, 21, 33);
sis.sister(11, 22, 30,"45");
sis.sister(12,"20", 15, 10);
Sister.sister(2, 4, 6, 8, 10); // static methoed
sis.sister(10, 20, 30, 40);

       System.out.println("\n----------Niece---------");
Niece nc = new Niece();
nc.sister();
nc.sister(13, 25);
nc.sister(40, 30, 50);
nc.sister(5, 9, 15,"30");
nc.sister(20, "10", 18, 15);
}
}

