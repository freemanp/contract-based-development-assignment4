package dk.cphbusiness.models;

public class Evaluation {
	private String comment;
	private int score;
	private Member evaluator;
	
	public Evaluation(String comment, int score, Member evaluator) {
		this.comment = comment;
		this.score = score;
		this.setEvaluator(evaluator);
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

	public Member getEvaluator() {
		return evaluator;
	}

	public void setEvaluator(Member evaluator) {
		this.evaluator = evaluator;
	}
}
