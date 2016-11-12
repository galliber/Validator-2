
public class Individual 
{
	private String name;
	private String email;
	private String facilityKey;
	private String EGN;
	
	public Individual(String name, String email, String facilityKey, String EGN)
	{
		if(check(name, email, facilityKey, EGN)==true)
		{
			this.name=name;
			this.email=email;
			this.facilityKey=facilityKey;
			this.EGN=EGN;
		}
	}
	
	private boolean check(String Name, String Email, String FacilityKey, String EGN)
	{
		NameValidator name=new NameValidator();
		EmailValidator email=new EmailValidator();
		FacilityKeyValidator fkey=new FacilityKeyValidator();
		EGNValidator egn=new EGNValidator();
		if(name.validateName(Name)&&email.validateEmail(Email)&&fkey.validateFacilityKey(FacilityKey)&&egn.validateEGN(EGN))
		{
			System.out.println("The information is valid and the Individual has been created.");
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
			if(egn.validateEGN(EGN)==false)
			{
				System.out.println("Invalid EGN");
			}
			return false;
		}
		
	}
}
