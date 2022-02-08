package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmName("Shamsu");
		employee.setEmAge(44);
		employee.setEmSex('M');
		employee.setUsCitizen(true);

		System.out.println("Employee Name: " + employee.getEmName() + ",\nAge: " + employee.getEmAge() + ",\nSex: "
				+ employee.getEmSex() + ",\nUsCitizen: " + employee.isUsCitizen());

	}

}
