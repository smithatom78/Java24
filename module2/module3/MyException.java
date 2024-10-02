package module3;
//if we extend RuntimeException(Unchecked) in our own exception class,
//compiler will not check whether it is handled or not
public class  MyException extends RuntimeException{
	
	private String message;
	public  MyException() {
		//message=msg;
	}
	public  MyException(String msg) {
		message=msg;
	}
	public String getMessage()
	{return message;
		}
	}