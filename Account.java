package onsdag;

public class Account {
	private String nbr;
	private double balance;
	private Person owner;
	
	public void setNbr (String nbr){
		this.nbr = nbr;
	}
	public String getNbr (){
		return nbr;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance () {
		return balance;
	}
	public Account () {
		balance = 0.00;
	}
	public void credit (double amount){
		balance = balance + amount;
	}
	public void withdraw (double amount){
		balance = balance - amount;
		
	}
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	public Person getOwner () {
		return owner;
	}

}
