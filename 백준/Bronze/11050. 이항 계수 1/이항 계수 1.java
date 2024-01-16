import java.util.*;

public class Main {
	static int factorial(int x) {
		if(x == 0)
			return 1;
		else
			return (x * factorial(x-1));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		
		System.out.println(factorial(N) / (factorial(N-K) * factorial(K)));
	}
}