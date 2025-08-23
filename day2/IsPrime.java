package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int num = 35;  						
        boolean isNotPrime = false;  
        
        if (num <= 1) {
            isNotPrime = true;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {   			
                isNotPrime = true;
                break;  
            }
            
        }
                       
        if (isNotPrime) {
            System.out.println(num + " is Not a Prime Number");
        } else {
            System.out.println(num + " is a Prime Number");
        }

	}

}
