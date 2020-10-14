//Janani Rajan, 7/23/2019
public class CreateObjects {
	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Boat boat1 = new Boat();
		Boat boat2 = new Boat();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();

		Sounds [] arr = { car1, boat1, cat1, dog1, car2, boat2, cat2, dog2 };

		for (int i = 0; i < arr.length; i++) {
			arr[i].makeSound();

		}
	}
}
 