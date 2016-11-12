import java.util.regex.*;

public class FacilityKeyValidator 
{
	private Pattern pattF;
	private Matcher matchF;
	private static final String FACILITY_KEY_PATTERN="[0-9]{2}\\-[0-9]{3}";
	
	public FacilityKeyValidator()
	{
		pattF=Pattern.compile(FACILITY_KEY_PATTERN);
	}
	
	public boolean validateFacilityKey(String str)
	{
		matchF=pattF.matcher(str);
		return matchF.matches();
	}
}
