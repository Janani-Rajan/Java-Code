public class CreateEmployees {
	public static void main(String[] args) {
		
		SalariedEmployee employee1 = new SalariedEmployee();
		employee1.setName("Fewfje Jeqijfbiqew");
		employee1.setDate(1, 2, 3003);
		employee1.setSalaryAmt(4005006.23);
		
		HourlyEmployee employee2 = new HourlyEmployee();
		employee2.setName("Brfew Mewqefwefw");
		employee2.setDate(3, 18, 10);
		employee2.setHoursWorked(4080);
		
		Employee employee3 = new SalariedEmployee();
		employee3.setName("Trgwgi Jjknmweofne");
		employee3.setDate(9, 29, 19);
		((SalariedEmployee) employee3).setSalaryAmt(543212345);
		
		Employee employee4 = new HourlyEmployee();
		employee4.setName("Kkwffweqqw Hqeoj");
		employee4.setDate(8, 27, 5555);
		((HourlyEmployee) employee4).setHourlyWage(33);
		((HourlyEmployee) employee4).setHoursWorked(33);
		
		Employee employee5 = new SalariedEmployee();
		employee5.setName("Rwoqejnw Yeqijrbqei");
		employee4.setDate(2, 22, 2222);
		((SalariedEmployee)employee5).setSalaryAmt(485428953);

		Employee[] arr = { employee1, employee2, employee3, employee4, employee5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Employee " + (i + 1));
			System.out.println("Name: " + arr[i].getName());
			System.out.println(" Hire Date: " + arr[i].getDate());
			if (arr[i] instanceof SalariedEmployee) {
				System.out.println("Annual Salary Amount: " + ((SalariedEmployee) arr[i]).getSalaryAmt());
			} else {
				System.out.println("Hours Worked: " + ((HourlyEmployee) arr[i]).getHoursWorked());
				System.out.println("Hourly Wage: " + ((HourlyEmployee) arr[i]).getHourlyWage());
			}
			System.out.println("--------------------");

		}

	}
}
