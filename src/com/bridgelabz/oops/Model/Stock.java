package com.bridgelabz.oops.Model;

public class Stock {

	private String stockName;
	private int numberOfShares;
	private int SharePrice;
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) 
	{
		this.stockName = stockName;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	public int getSharePrice() {
		return SharePrice;
	}
	public void setSharePrice(int sharePrice) {
		SharePrice = sharePrice;
	}
	
}
