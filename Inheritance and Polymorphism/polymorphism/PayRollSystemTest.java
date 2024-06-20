package polymorphism;


public class PayRollSystemTest {

	public static void main(String[] args) {
		
		//Employee abc = new Employee("ahmad", "ali");
		SalariedEmployee salariedEmployee = new SalariedEmployee( "John", "Smith", 800.00 );
		HourlyEmployee hourlyEmployee = new HourlyEmployee( "Karen", "Price", 16.75, 40 );
		CommisionEmployee commissionEmployee = new CommisionEmployee ("Sue", "Jones", 10000, .06 );
		BasePlusCommisionEmployee basePlusCommissionEmployee = new BasePlusCommisionEmployee ("Bob", "Lewis", 5000, .04, 300 );

		System.out.println( "Employees processed individually: " );
		System.out.println( "Salaried Employee : " + salariedEmployee.getFirstName() + salariedEmployee.getLastName() +
				"\n" +"Weekly Salary: " + salariedEmployee.getWeeklySalary() + 
				"\n"+ "Earned: " + salariedEmployee.earnings() );
		//--------------------------------------------------------------------------------------------------------------
		
		// YOUR TASK
		//Create Objects of other Classes
		
		//***************************************************************************
	}

}
