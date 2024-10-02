package m1;

public class InsufficientAmountException extends Exception {

	private String message;
	public InsufficientAmountException(String msg) 
	{message=msg;
		}
	public InsufficientAmountException() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage()
	{return message;
		}
}
