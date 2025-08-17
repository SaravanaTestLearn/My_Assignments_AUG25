package week1.day1;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		String	name = "John Doe",mobileNumber = "9876543210";		
		byte	age = 30,luckyNumber = 7;
		int 	pinCode = 56001;
		float	rating = 4.5f;
		double	salary = 55000.75d;
		char	gender = 'M';
		boolean	acceptTerms = true;
		
		System.out.println(" \033[1mEmployee Detais\033[0m"+
        		"\n Employee Name		: "+name+
        		"\n Employee Age		: "+age+
        		"\n Employee Salary	: "+salary+
        		"\n Employee Gender	: "+gender+
        		"\n Employee acceptTerms	: "+acceptTerms+
        		"\n Employee Rating	: "+rating+
        		"\n Employee Mobile Number	: "+mobileNumber+
        		"\n Employee Pincode	: "+pinCode+
        		"\n Employee Lucy Number	: "+luckyNumber );

	}

}
