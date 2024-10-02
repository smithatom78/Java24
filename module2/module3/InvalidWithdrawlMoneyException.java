package module3;

public class InvalidWithdrawlMoneyException extends Exception
{
private String message;
public InvalidWithdrawlMoneyException(String msg) 
{message=msg;
	}
public String getMessage()
{return message;
	}
}