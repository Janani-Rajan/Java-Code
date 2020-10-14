public class SuperHero {
	private String suit;
	private String cape;
	private boolean powers;
	HeroDate birthday = new HeroDate();
	HeroName name = new HeroName();

//Class constructor
	public SuperHero() {
		suit = "";
		cape = "";
		powers = false;
	}

	// Cape getter/setter methods
	public String getCape() {
		return cape;
	}

	public void setCape(String c) {
		cape = c;
	}

	// Suit getter/setter methods
	public String getSuit() {
		return suit;
	}

	public void setSuit(String s) {
		suit = s;
	}
	
	//Powers getter/setter methods
	public boolean getPowers() {
		return powers;
	}
	
	public void enablePowers() {
		powers = true;
	}
	
	
	public void disablePowers() {
		powers = false;
	}

	// Birthday getter/setter methods
	public String getBirthday() {
		return birthday.getDateString();
	}

	public void setBirthday(int m, int d, int y) {
		birthday.setDate(m, d, y);
	}

	// Name getter/setter methods
	public String getName() {
		return name.getName();
	}

	public void setName(String sName) {
		name.setName(sName);
	}

	
}
