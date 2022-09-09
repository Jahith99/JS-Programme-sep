package emp.org;

public class Employee {
	private void empId() {
		System.out.println("EMPLOYEE ID-12345");
	}
	private void empName() {
		System.out.println("EMPLOYEE NAME-SRIRAM");
	}
	private void empDob() {
		System.out.println("EMPLOYEE DOB-01.01.0101");
	}
	private void empPhone() {
		System.out.println("EMPLOYEE PHONE-1234567890");
	
	}
	private void empEmail() {
		System.out.println("EMPLOYEE EMAIL-srm01@gmail.com");
	}
	private void empAddress() {
		System.out.println("EMPLOYEE ADDRESS-CHENNAI");
		
	}
public static void main(String args[]) {
	Employee details = new Employee();
	details.empId();
	details.empName();
	details.empDob();
	details.empPhone();
	details.empEmail();
	details.empAddress();

}
}
