package dk.cphbusiness.models;

import java.util.List;

public class Item {
	private String name;
	private int value;
	private boolean isAvailableForLoan;
	private List<ItemEvaluation> evaluations;
	private Member owner;
	
	public Item(String name, int value, Member owner) {
		this.name = name;
		this.value = value;
		this.setOwner(owner);
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

	public List<ItemEvaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<ItemEvaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Member getOwner() {
		return owner;
	}

	public void setOwner(Member owner) {
		this.owner = owner;
	}
}
