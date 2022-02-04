package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n-------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptilInfo();
		reptile.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n-----------------------------------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();

		System.out.println("\n-------------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptilInfo();
		snake.animalInfo();

		System.out.println("\n--------------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n----------------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n-------------------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptilInfo();
		cobra.animalInfo();
	}
}
