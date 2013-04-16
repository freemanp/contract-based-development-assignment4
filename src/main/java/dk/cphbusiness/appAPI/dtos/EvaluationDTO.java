package dk.cphbusiness.appAPI.dtos;

public class EvaluationDTO {
	private String comment;
	private int score;

	public EvaluationDTO(String comment, int score) {
		this.comment = comment;
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
