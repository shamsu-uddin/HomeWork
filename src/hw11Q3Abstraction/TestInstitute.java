package hw11Q3Abstraction;

public class TestInstitute {

	public static void main(String[] args) {

		System.out.println("\n--------------------- Regular class ColumbiaUniversity ------------------------\n");

		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.anatomyLab();
		cu.biology();
		cu.cafeteria();
		cu.classSize();
		cu.ColumbiaUniversity();
		cu.commonRoom();
		ColumbiaUniversity.name();
		cu.emergencyRoom();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.lawInfo();
		cu.playGround();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();
		
		System.out.println("\n------------------------interface Class University------------------------------\n");		         

		University uv = new ColumbiaUniversity();
		uv.classSize();
		uv.gymnasium();
		uv.playGround();
		uv.teacher();

		System.out.println("\n--------------------------abstract Class MedicalSchool-------------------------------\n");

		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		MedicalSchool.nySchool();
     }
 }
