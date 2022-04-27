package base;

import java.time.LocalDate;

public class CreditCard extends Card {
	private int credit;

	public CreditCard(String owner, LocalDate validity, int balance, Bank cardbank, int credit) {
		super(owner, validity, balance, cardbank);
		this.credit = credit;
	}

	public CreditCard(String owner, LocalDate validity, int balance, Bank cardbank) {
		this(owner, validity, balance, cardbank, 100000);
		//this.credit = 100000;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "CreditCard [credit=" + credit + ", toString()=" 
				+ super.toString() + "]";
	}
	
	@Override
	public boolean withdraw(int amount) {
		if (!this.getValidity().isBefore(LocalDate.now())) {
			if (this.getBalance() + this.credit >= amount ) {
				int diff = getBalance() - amount;
				if (diff >= 0) {
					this.setBalance(this.getBalance()-amount);
				}
				else {
					this.setCredit(credit-(amount-getBalance()));
					this.setBalance(0);
				}
					
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
}
