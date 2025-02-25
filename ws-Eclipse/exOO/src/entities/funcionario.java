package entities;

public class funcionario {
	public String name;
	public double salary;
	public double tax;
	public double increase;

	public double employee() {
		return salary - tax;
	}
	
	public double newSalary() {
		return employee() + ((salary * increase) / 100);
	}
	
	
}
