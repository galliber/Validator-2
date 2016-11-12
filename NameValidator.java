import java.util.regex.*;

public class NameValidator 
{
	private Pattern pattU;
	private Matcher matchU;
	private static final String NAME_PATTERN="[A-Z][a-zA-Z- ]{3,50}";
	
	public NameValidator()
	{
		pattU=Pattern.compile(NAME_PATTERN);
	}
	
	public boolean validateName(String str)
	{
		matchU=pattU.matcher(str);
		return matchU.matches();
	}
}
