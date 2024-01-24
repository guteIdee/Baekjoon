import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			A[i] = x;
		}
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			B[i] = x;
		}
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			list.add(A[i]);
		}
		for (int i = 0; i < M; i++) {
			list.add(B[i]);
		}
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (Integer integer : list) {
			sb.append(integer).append(" ");
		}
		System.out.println(sb);
	}
}
