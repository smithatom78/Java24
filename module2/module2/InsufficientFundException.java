package module2;

public class InsufficientFundException extends Exception{
		private String message;
		public InsufficientFundException(String msg) 
		{message=msg;
			}
		public String getMessage()
		{return message;
			}
		}