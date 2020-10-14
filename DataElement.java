//Janani Rajan, 8/6/19
public class DataElement {
	// DataElement is an object that represents a line in the file
	private int totalPopulation;
	private int childPopulation;
	private int childPoverty;
	private String stateCode;

	// Extract the attributes from the text line
	public void setCompleteLine(String completeData) {
		totalPopulation = Integer.parseInt((completeData.substring(82, 90)).replace(" ", ""));
		childPopulation = Integer.parseInt((completeData.substring(91, 99)).replace(" ", ""));
		childPoverty = Integer.parseInt((completeData.substring(100, 108)).replace(" ", ""));
		stateCode = completeData.substring(0, 2);
	}

	// getter for totalPopulation
	public int getTotalPopulation() {
		return totalPopulation;
	}

	// getter for childPopulation
	public int getChildPopulation() {
		return childPopulation;
	}

	// getter for childPoverty
	public int getChildPovertyPopulation() {
		return childPoverty;
	}

	// getter for stateCode
	public String getStateCode() {
		return stateCode;
	}

	// Integer version of state code
	public int getIntStateCode() {
		return Integer.parseInt(stateCode);
	}
}
