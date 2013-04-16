package dk.cphbusiness.appAPI.dtos;

import java.util.List;

import dk.cphbusiness.models.Evaluation;
import dk.cphbusiness.models.Item;
import dk.cphbusiness.models.Rental;

public class MemberDTO {
	private String name;
	private int points;
	private List<Evaluation> evaluations;
	private List<Item> items;
	private List<Rental> rentals;
	
	public MemberDTO(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
}
