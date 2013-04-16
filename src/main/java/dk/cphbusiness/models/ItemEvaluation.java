package dk.cphbusiness.models;

public class ItemEvaluation extends Evaluation {
	private Item evaluatee;
	
	public ItemEvaluation(String comment, int score, Member evaluator, Item evaluatee) {
		super(comment, score, evaluator);
		this.setEvaluatee(evaluatee);
	}

	public Item getEvaluatee() {
		return evaluatee;
	}

	public void setEvaluatee(Item evaluatee) {
		this.evaluatee = evaluatee;
	}
}
