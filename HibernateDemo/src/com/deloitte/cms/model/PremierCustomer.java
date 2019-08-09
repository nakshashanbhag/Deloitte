package com.deloitte.cms.model;

public  class PremierCustomer extends Customer {
	private int rewardPoints;
	public PremierCustomer() {
		
	}

	public PremierCustomer(int customerId, String customerName, String customerAddress, int billAmount) {
		super(customerId, customerName, customerAddress, billAmount);
		
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
