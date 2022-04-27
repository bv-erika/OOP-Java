package base;

import java.time.LocalDate;

public class Card {
	public enum Bank { OTP, ERSTE, KANDH, CIB }
	
	private String owner;
	private LocalDate validity;
	private int balance;
	private Bank cardbank;
	
	public Card(String owner, LocalDate validity, int balance, Bank cardbank) {
		super();
		this.owner = owner;
		this.validity = validity;
		this.balance = balance;
		this.cardbank = cardbank;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public LocalDate getValidity() {
		return validity;
	}

	public Bank getCardbank() {
		return cardbank;
	}

	@Override
	public String toString() {
		return "Card [owner=" + owner + ", validity=" + validity + ", balance=" + balance + ", cardbank=" + cardbank
				+ "]";
	}
	
	public boolean withdraw(int amount) {
		if (!this.validity.isBefore(LocalDate.now())) {
			if (this.balance >= amount ) {
				this.balance -= amount;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	
	
}
