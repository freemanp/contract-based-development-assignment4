package dk.cphbusiness.models;

import java.util.Date;

public class Rental {
	private Date startOfRental;
	private Date expectedHandBack;
	private Date actualHandBack;
	private Item item;

	public Rental(Date startOfRental, Date expectedHandBack, Date actualHandBack, Item item) {
		this.startOfRental = startOfRental;
		this.expectedHandBack = expectedHandBack;
		this.actualHandBack = actualHandBack;
		this.item = item;
	}

	public Date getStartOfRental() {
		return startOfRental;
	}

	public void setStartOfRental(Date startOfRental) {
		this.startOfRental = startOfRental;
	}

	public Date getExpectedHandBack() {
		return expectedHandBack;
	}

	public void setExpectedHandBack(Date expectedHandBack) {
		this.expectedHandBack = expectedHandBack;
	}

	public Date getActualHandBack() {
		return actualHandBack;
	}

	public void setActualHandBack(Date actualHandBack) {
		this.actualHandBack = actualHandBack;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
}
