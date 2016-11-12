import java.util.regex.*;

public class EmailValidator 
{
	private Pattern pattE;
	private Matcher matchE;
	private static final String EMAIL_PATTERN="[a-z][a-zA-Z0-9\\.\\-]+@[a-zA-Z0-9]+\\.[a-z]{2,4}";
	
	public EmailValidator()
	{
		pattE=Pattern.compile(EMAIL_PATTERN);
	}
	
	public boolean validateEmail(String str)
	{
		matchE=pattE.matcher(str);
		return matchE.matches();
	}
}
