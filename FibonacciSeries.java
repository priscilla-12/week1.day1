package week1.day1assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 8, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till" + n + " terms:");
		for (int i = 1; i <= n; ++i) {
			//compute the next term
			System.out.println(firstTerm + ",");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			 
		}
	}
}
