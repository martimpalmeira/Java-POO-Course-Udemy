package exercises.secao15.practice168.model.entities;

import exercises.secao15.practice168.model.exception.AccountException;

public class Account {

	private Integer number;

	private String holder;

	private Double balance;

	private Double withdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		this.balance += amount;
	}

	public void withdraw(Double amount) throws AccountException {
		validateWithdraw(amount);
		this.balance -= amount;
	}
	
	public void validateWithdraw(Double amount) throws AccountException {
		if (amount > this.withdrawLimit) {
			throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > this.balance) {
			throw new AccountException("Withdraw error: Not enough balance");
		}
	}

}
