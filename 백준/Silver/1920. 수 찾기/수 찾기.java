import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			int num = scanner.nextInt();
			set.add(num);
		}
		
		int M = scanner.nextInt();

		for (int i = 0; i < M; i++) {
			int num = scanner.nextInt();
			if(set.contains(num))
				sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
