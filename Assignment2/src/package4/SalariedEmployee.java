package package4;

public class SalariedEmployee {
	private double fixedWeeklySalary;
	public SalariedEmployee(int id, String name, double fixedWeeklySalary) {
		super(id, name);
		this.fixedWeeklySalary=fixedWeeklySalary;
	}
	@Override
	public double getPayment() {
		return fixedWeeklySalary;
	}

	
}



