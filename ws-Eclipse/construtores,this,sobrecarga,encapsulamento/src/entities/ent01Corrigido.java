package entities;

public class ent01Corrigido {
	private int number;
	private String holder;
	private double balance;
	
	
	
	
	
	
	public ent01Corrigido(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	

	public ent01Corrigido(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	
	public int getnumber() {
		return number;
	}
	
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount+5;		
	}
	
	public String toString() {
		return "Account: " + number + ", Holder: " + holder + ", Balance: " + String.format("%.2f", balance);
	}
	
	
}
