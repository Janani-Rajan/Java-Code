//Janani Rajan, 7/23/19
public abstract class Vehicle implements Sounds{
	protected String make;
	protected int year;

	public void setMake(String m) {
		make = m;
	}

	public String getMake() {
		return make;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getYear() {
		return year;
	}
}

