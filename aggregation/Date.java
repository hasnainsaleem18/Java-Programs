
public class Date {
	private int month; 
	private int day; 
	private int year; 
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public Date( int theMonth, int theDay, int theYear )
	{
		month = checkMonth( theMonth ); // validate month
		year = theYear; 
		day = checkDay( theDay ); // validate day
		System.out.println("Date object constructor for date" + this );
	} 
	//***************************************************************
	
	private int checkMonth( int testMonth )
	{
		if ( testMonth > 0 && testMonth <= 12 ) // validate month
			{
				return testMonth;
			}
		else {
			
			throw new IllegalArgumentException( "month must be 1-12" );
			}
	}
	//*******************************************************************
		private int checkDay( int testDay )
		{
			if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
				{
				return testDay;
				}
			else {
				throw new IllegalArgumentException( "Day out-of-range for the specified month and year" );
				}
		}
	//*********************************************************************
		public String toString()
		{
		return String.format(  month + "/" + day + "/" + year );
		} 
}
