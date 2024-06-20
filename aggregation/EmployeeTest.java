
public class EmployeeTest {
public static void main(String[] args) {
		
		Date birth = new Date( 4, 30, 1949 );
		Date hire = new Date( 3, 12, 1988 );
		Employee employee = new Employee( "Bob", "Williams", birth, hire );
		System.out.println( employee );

	}
}
