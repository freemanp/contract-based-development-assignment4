package dk.cphbusiness.models;

public class MemberEvaluation extends Evaluation {
	private Member evaluatee;
	
	public MemberEvaluation(String comment, int score, Member evaluator, Member evaluatee) {
		super(comment, score, evaluator);
		this.setEvaluatee(evaluatee);
	}

	public Member getEvaluatee() {
		return evaluatee;
	}

	public void setEvaluatee(Member evaluatee) {
		this.evaluatee = evaluatee;
	}
}
