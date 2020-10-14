public class CreateDogs {
	public static void main(String[] args) {
		
		Dog dogOne = new Dog();
		dogOne.setName("Toffee");
		dogOne.setBreed("Chow-Chow");
		dogOne.setGender('F');
		dogOne.setWeight(1500);
		boolean y = true;
		dogOne.setFleas(y);

		System.out.println("Dog 1:");
		System.out.println("Name: " + dogOne.getName());
		System.out.println("Breed: " + dogOne.getBreed());
		System.out.println("Gender: " + dogOne.getGender());
		System.out.println("Weight: " + dogOne.getWeight() + " pounds.");
		dogOne.eat();
		dogOne.bark();
		if (y = true) {
			dogOne.scratch_fleas();

			Dog dogTwo = new Dog();
			dogTwo.setName("Snuffles");
			dogTwo.setBreed("Laborador Retriever");
			dogTwo.setGender('M');
			dogTwo.setWeight(17);
			y = false;
			dogTwo.setFleas(y);

			System.out.println("Dog 2:");
			System.out.println("Name: " + dogTwo.getName());
			System.out.println("Breed: " + dogTwo.getBreed());
			System.out.println("Gender: " + dogTwo.getGender());
			System.out.println("Weight: " + dogTwo.getWeight() + " pounds.");
			dogTwo.eat();
			dogTwo.bark();
			if (y = true) {
				dogTwo.scratch_fleas();
			}
		}
	}
}
