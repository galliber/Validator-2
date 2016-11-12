import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BulstatValidator 
{
	private Pattern pattEGN;
	private Matcher matchEGN;
	private static final String BULSTAT_PATTERN="[0-9]{9}";
	
	public BulstatValidator()
	{
		pattEGN=Pattern.compile(BULSTAT_PATTERN);
	}
	
	public boolean validateBulstat(String str)
	{
		matchEGN=pattEGN.matcher(str);
		return matchEGN.matches();
	}
}
