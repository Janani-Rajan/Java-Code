public class Dog {
	public static String name;
	public String breed = "Unknown";
	public char gender;
	public double weight = 0;
	public boolean fleas = false;

	public String getName() {
		return name;
	}

	public void setName(String str) {
		name = str;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String str) {
		breed = str;
	}
	
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char ch) {
		gender = ch;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double d) {
		weight = d;
	}
	
	public boolean getFleas() {
		return fleas;
	}
	
	public void setFleas(boolean truefalse) {
		fleas = truefalse;
	}

	public void eat() {
		System.out.println("chomp, chomp");
	}

	public void bark() {
		System.out.println("woof, woof");
	}

	public void scratch_fleas() {
		System.out.println("scratch, scratch");
	}

	

}
