
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;

	
		public Employee( String first, String last, Date dateOfBirth,Date dateOfHire )
		{
			firstName = first;
			lastName = last;
			birthDate = dateOfBirth;
			hireDate = dateOfHire;
		}
		public String toString()
		{
			return String.format( lastName + ", "+ firstName + " " + "HireDate " + hireDate + " " + "BirthDate " + birthDate );
		} 
		
}
