package com.bridgelabz.oops.Model;

import java.util.List;

public class TransactionModel {
	private String transaction;
	private List<Transactions> transactions;

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

}
