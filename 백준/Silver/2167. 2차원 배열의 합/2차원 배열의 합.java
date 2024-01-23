import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int x = sc.nextInt();
				arr[i][j] = x;
			}
		}
		
		
		int K = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int h = 0; h < K; h++) {
			int sum = 0;
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int a = (i - 1); a < x; a++) {
				for (int b = (j - 1); b < y; b++) {
					sum += arr[a][b];
				}
			}

			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}
