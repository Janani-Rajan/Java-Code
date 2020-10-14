public class CreateHeroes {
	public static void main(String[] args) {
		// Hero 1
		SuperHero hero1 = new SuperHero();
		hero1.setName("Joe");
		hero1.setBirthday(1, 2, 1999);
		hero1.setSuit("Super-joe suit");
		hero1.setCape("Super-joe cape");
		hero1.disablePowers();

		// Hero 2
		SuperHero hero2 = new SuperHero();
		hero2.setName("Captain Marvel");
		hero2.setBirthday(3, 4, 1999);
		hero2.setSuit("Marvellous suit");
		hero2.setCape("Marvellous cape");
		hero2.enablePowers();

		// Hero3

		SuperHero hero3 = new SuperHero();
		hero3.setName("Blobfishman");
		hero3.setBirthday(5, 6, 1999);
		hero3.setSuit("Blobfish suit");
		hero3.setCape("No cape");
		hero3.enablePowers();

		SuperHero hero_array[] = { hero1, hero2, hero3 };

		for (int heroCount = 0; heroCount < hero_array.length; heroCount++) {
			System.out.println(
					"Name: " + hero_array[heroCount].getName() + "\n" + 
					"Birthdate: "+ hero_array[heroCount].getBirthday() + "\n" +
					"Suit: " + hero_array[heroCount].getSuit() + "\n" + 
					"Cape: " + hero_array[heroCount].getCape() + "\n" + 
				    "Powers: " + hero_array[heroCount].getPowers()); 
			System.out.println();
			System.out.println();
			System.out.println();
		}

	}
}