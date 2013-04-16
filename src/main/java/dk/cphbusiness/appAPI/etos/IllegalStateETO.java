package dk.cphbusiness.appAPI.etos;

public class IllegalStateETO extends IllegalStateException {
	private static final long serialVersionUID = -5133856741380106448L;

	public IllegalStateETO() {
		super();
	}

	public IllegalStateETO(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalStateETO(String s) {
		super(s);
	}

	public IllegalStateETO(Throwable cause) {
		super(cause);
	}
}
