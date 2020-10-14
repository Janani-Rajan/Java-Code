//Janani Rajan, 7/23/2019
public abstract class Animal implements Sounds {
	protected int age;
	protected double weight;

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(double d) {
		weight = d;
	}

	public double getWeight() {
		return weight;
	}
}
