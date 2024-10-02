package lab24;

public class InvalidScoreException extends Exception
{
private String message;
public InvalidScoreException(String msg) 
{message=msg;
	}

public String getMessage()
{return message;
	}
}
