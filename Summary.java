//Janani Rajan, 8/6/19
//A Summary Object is an object that takes all data from DataElement and summarizes it (for one state code)
public class Summary {

	private int totalPopulation;
	private int childPopulation;
	private int childPoverty;
	private String stateCode;

	// Total population getter method
	public int getTotalPopulation() {
		return totalPopulation;
	}

	// Add to total population value
	public void addToTotalPopulation(int i) {
		totalPopulation += i;
	}

	// Child population getter method
	public int getChildPopulation() {
		return childPopulation;
	}

	// Add to child population
	public void addToChildPopulation(int i) {
		childPopulation += i;
	}

	// Child Poverty population getter method
	public int getChildPoverty() {
		return childPoverty;
	}

	// Add to child poverty
	public void addToChildPoverty(int i) {
		childPoverty += i;
	}

	// State Code getter/setter methods
	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String s) {
		stateCode = s;
	}

	// Returns formatted summary data
	public String getSummaryString() {
		return String.format("%s %15d %15d %15d", stateCode, totalPopulation, childPopulation, childPoverty);
	}

	// returns true if the given summary Object has valid data
	public boolean hasValue() {
		return (totalPopulation > 0 || childPopulation > 0 || childPoverty > 0);
	}
}
