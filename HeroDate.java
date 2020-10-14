public class HeroDate {
	private int year;
	private int month;
	private int day;

	public HeroDate() {
		month = 0;
		day = 0;
		year = 0;
	}

	public void setDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public String getDateString() {
		return month + "/" + day + "/" + year;
	}
}
