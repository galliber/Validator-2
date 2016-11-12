import java.util.regex.*;

public class EGNValidator 
{
	private Pattern pattEGN;
	private Matcher matchEGN;
	private static final String EGN_PATTERN="[0-9]{10}";
	
	public EGNValidator()
	{
		pattEGN=Pattern.compile(EGN_PATTERN);
	}
	
	public boolean validateEGN(String str)
	{
		matchEGN=pattEGN.matcher(str);
		return matchEGN.matches();
	}
}
