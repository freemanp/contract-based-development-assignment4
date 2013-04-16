package dk.cphbusiness.appAPI.dtos;

import java.util.Date;

public class RentalDTO {
	private Date startOfRental;
	private Date expectedHandBack;
	private Date actualHandBack;
	
	public RentalDTO(Date startOfRental, Date expectedHandBack,
			Date actualHandBack) {
		super();
		this.startOfRental = startOfRental;
		this.expectedHandBack = expectedHandBack;
		this.actualHandBack = actualHandBack;
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
}
