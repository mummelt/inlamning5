package onsdag;

import java.util.*;

public class Person {
	private String pNbr;
	private String namn;
	
	private ArrayList<Account> accounts = new ArrayList <Account> ();
	
	public void setPNbr (String pNbr){
		this.pNbr = pNbr;
	}
	public String getPNbr (){
		return pNbr;
	}
	public void setNamn (String namn){
		this.namn = namn;
	}
	public String getNamn (){
		return namn;
	}
	public void setAccounts(ArrayList<Account> accounts){
		this.accounts = accounts;
	}
	public ArrayList<Account> getAccounts(){
		return this.accounts;
	}
	public void addAccount (Account a){
		 this.accounts.add(a);
	}
	
}