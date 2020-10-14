public class HourlyEmployee extends Employee{

private int hoursWorked;
private double hourlyWage;

public HourlyEmployee() {
	hourlyWage = 50;
}

public int getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(int i) {
	hoursWorked = i;
}
public double getHourlyWage() {
	return hourlyWage;
}
public void setHourlyWage(double d) {
	hourlyWage = d;
}

}
