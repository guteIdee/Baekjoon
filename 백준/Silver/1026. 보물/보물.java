import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			A[i] = x;
		}
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			B[i] = x;
		}
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += A[i] * B[N - 1 - i];
		}
		System.out.println(sum);
	}
}
