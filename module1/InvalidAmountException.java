package m1;

public class InvalidAmountException  extends Exception{

	private String message;
	public InvalidAmountException(String msg) 
	{message=msg;
		}
	public InvalidAmountException() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage()
	{return message;
		}
}
