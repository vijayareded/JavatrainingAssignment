package package5;

public class ComissionEmployeeextendsEmployee {
	private double commisionPercentage;
	private double totalSales;

	public CommissionEmployee(int id, String name, double commisionPercentage, double totalSales) {
		super(id, name);
		this.commisionPercentage = commisionPercentage;
		this.totalSales = totalSales;
	}

	@Override
	public double getPayment() {
		return totalSales * commisionPercentage / 100;
	}

}


