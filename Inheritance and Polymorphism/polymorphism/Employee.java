package polymorphism;

public abstract class Employee {

	private String firstName;
	private String lastName;

		public Employee( String first, String last )
		{
			firstName = first;
			lastName = last;
		}
		public void setFirstName( String first )
		{
			firstName = first; 
		} 
		
		public String getFirstName()
		{
			return firstName;
		} 
		public void setLastName( String last )
		{
			lastName = last;
		} 
		public String getLastName()
		{
			return lastName;
		}
	// *****************************************
	public abstract double earnings();
}
