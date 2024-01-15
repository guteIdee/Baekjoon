import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int min, max = 0;
		
		for (int i = 1; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0)	
				max = i;
		}
		
		min = (a * b) / max;
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
