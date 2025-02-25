package entities;

public class entitiesEx01 {
	public String name;
	public String initialDeposit;
	public int number;
	public double deposit;
	public double deposit2;
	public double withdraw;

	public String toString() {
		return "Account: " + number + ", Holder: " + name + ", Balance: " + String.format("%.2f", deposit + deposit2);

	}

	public String toString2() {
		return "Account: " + number 
				+ ", Holder: " 
				+ name 
				+ ", Balance: "
				+ String.format("%.2f", deposit + deposit2 - withdraw - 5);

	}

//	public entitiesEx01(String name, String initialDeposit, int number, double deposit, double deposit2) {
//		this.name = name;
//		this.number = number;
//	}
//	public entitiesEx01(String name, String initialDeposit, int number) {
//		this.name = name;
//		this.initialDeposit = initialDeposit;
//		this.number = number;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getInitialDeposit() {
//		return initialDeposit;
//	}
//	public int getNumber() {
//		return number;
//	}

}
