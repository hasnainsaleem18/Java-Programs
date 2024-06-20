
public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;

	
		public Employee( String first, String last, int month, int day, int year)
		{
			firstName = first;
			lastName = last;
			birthDate = new Date(month, day, year);
		}
		public String toString()
		{
			return String.format( lastName + ", "+ firstName + " " + birthDate );
		} 
		
}
