package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstTem = 0, secondTem = 1, range = 8, nextTem; 
		System.out.println("Fibonacci Series till " + range + " terms:");
		for (int i = 0; i <= range; ++i) {
			if (i<range) {
				System.out.print(firstTem +", ");
				nextTem = firstTem + secondTem;
				firstTem = secondTem;
				secondTem = nextTem;					
			}if (i==range) {System.out.print("and "+firstTem);}	
			
		}

	}

}
