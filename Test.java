package onsdag;

public class Test {
	
	public static void main(String[] args) {
	
	Person p1 = new Person();
	
	p1.setNamn("Elvis");
	p1.setPNbr("01");
	
	Account a1 = new Account();
	
	p1.addAccount(a1);
	a1.setNbr("0101");
	a1.setBalance(1000);
	a1.setOwner(p1);
	
	Account a2 = new Account();
	
	p1.addAccount(a2);
	a2.setNbr("0102");
	a2.setBalance(2000);
	a2.setOwner(p1);
	
	Person p2 = new Person();
	
	p2.setNamn("Rod");
	p2.setPNbr("02");
	
	Account a3 = new Account();
	
	p2.addAccount(a3);
	a3.setNbr("0201");
	a3.setBalance(1000);
	a3.setOwner(p2);
	
	Account a4 = new Account ();
	
	p2.addAccount(a4);
	a4.setNbr("0202");
	a4.setBalance(2000);
	a4.setOwner(p2);
	
	PersonRegister reg1 = new PersonRegister ();
	
	reg1.addPerson(p1);
	reg1.addPerson(p2);
	
	//reg1.findPerson("")
	
	System.out.println(p1.getNamn() + " " + p1.getPNbr());
	System.out.println("Kontonummer: " + a1.getNbr() + " Saldo: " + a1.getBalance());

	reg1.removePerson("01");
	Person temp = reg1.findPerson("01");
	if (temp == null){
		System.out.println("Personen finns inte längre."); 
	}
	
	System.out.println(p1.getNamn());
	
	System.out.println(p1.getAccounts());
	
	System.out.println(p2.getNamn() + " " + p2.getPNbr() + " " + a3.getNbr() + " " + a4.getNbr());

	a4.credit(300);
	a4.withdraw(250);
	
	System.out.println(a4.getBalance() + " " + p2.getAccounts());
	
	// addPerson, findPerson, removePerson, addAccount, credit, withdraw
	
	
	
	}
	

}
