
public class LegalEntity
{
	private String name;
	private String email;
	private String facilityKey;
	private String bulstat;
	
	public LegalEntity(String name, String email, String facilityKey, String bulstat)
	{
		if(check(name, email, facilityKey, bulstat)==true)
		{
			this.name=name;
			this.email=email;
			this.facilityKey=facilityKey;
			this.bulstat=bulstat;
		}
	}
	
	private boolean check(String Name, String Email, String FacilityKey, String Bulstat)
	{
		NameValidator name=new NameValidator();
		EmailValidator email=new EmailValidator();
		FacilityKeyValidator fkey=new FacilityKeyValidator();
		BulstatValidator bulstat=new BulstatValidator();
		if(name.validateName(Name)&&email.validateEmail(Email)&&fkey.validateFacilityKey(FacilityKey)&&bulstat.validateBulstat(Bulstat))
		{
			System.out.println("The information is valid and the Legal Entity has been created.");
			return true;
		}
		else
		{
			System.out.println("Something went wrong. :");
			if(name.validateName(Name)==false)
			{
				System.out.println("Invalid Name");
			}
			if(email.validateEmail(Email)==false);
			{
				System.out.println("Invalid E-mail");
			}
			if(fkey.validateFacilityKey(FacilityKey)==false)
			{
				System.out.println("Invalid Facility Key");
			}
			if(bulstat.validateBulstat(Bulstat)==false)
			{
				System.out.println("Invalid Bulstat");
			}
			return false;
		}
		
	}
}
