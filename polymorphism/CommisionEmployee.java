package polymorphism;


public class CommisionEmployee extends Employee {

	private double grossSales;
	private double commissionRate; 
	
		public CommisionEmployee( String first, String last, double sales, double rate )
			{
				super( first, last );
				setGrossSales( sales );
				setCommissionRate( rate );
			}
		public void setCommissionRate( double rate )
		{
			if ( rate > 0.0 && rate < 1.0 )
				{
					commissionRate = rate;
				}
			else {
					throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0" );
				}
		}
	//****************************
		public double getCommissionRate()
			{
				return commissionRate;
			} 
		
		public void setGrossSales( double sales )
			{
			if ( sales >= 0.0 )
				{
					grossSales = sales;
				}
			else
				{
					throw new IllegalArgumentException("Gross sales must be >= 0.0" );
				}
			} 
	//****************************
		public double getGrossSales()
		 {
			return grossSales;
		 }
	//******************************
		@Override
		public double earnings()
		{
		return getCommissionRate() * getGrossSales();
		} 
	//****************************
}
