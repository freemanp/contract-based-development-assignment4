package dk.cphbusiness.appAPI.dtos;

public class MemberDTO {
	private String name;
	private int points;
	
	public MemberDTO(String name, int points) {
		super();
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
}
