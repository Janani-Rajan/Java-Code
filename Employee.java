public class Employee {
	private String name;
	private Date hireDate = new Date();

	public String getName() {
		return name;
	}

	public void setName(String str) {
		name = str;
	}

	public String getDate() {
		return hireDate.getDate();
	}

	public void setDate(int m, int d, int y) {
		hireDate.setDate(m, d, y);
	}
	
}