package dk.cphbusiness.models;

public class Item {
	private String name;
	private int value;
	private boolean isAvailableForLoan;
	
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
		isAvailableForLoan = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isAvailableForLoan() {
		return isAvailableForLoan;
	}

	public void setAvailableForLoan(boolean isAvailableForLoan) {
		this.isAvailableForLoan = isAvailableForLoan;
	}
}
