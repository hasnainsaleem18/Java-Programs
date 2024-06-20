package polymorphism;

public class SalariedEmployee extends Employee{
		
		private double weeklySalary;

		public SalariedEmployee( String first, String last, double salary )
			{
			super( first, last); 
			setWeeklySalary( salary ); 
			} 
	//********************************
		public void setWeeklySalary( double salary )
		{
			if ( salary >= 0.0 )
				{
				weeklySalary = salary;
				}
			else
				{
				throw new IllegalArgumentException("Weekly salary must be >= 0.0" );
				}
		}
	//*********************************
	
		public double getWeeklySalary()
			{
				return weeklySalary;
			}
	// **********************************
		@Override
		public double earnings()
		{
			return getWeeklySalary();
		} 
	// **********************************	
}
