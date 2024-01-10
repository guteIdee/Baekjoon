import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		
		for (int i = 0; i < K; i++) {
			int n = scanner.nextInt();
			if(n == 0) {
				stack.pop();
			}
			else {
				stack.push(n);
			}
		}
		for (Integer integer : stack) {
			answer += integer;
		}
		System.out.println(answer);
	}
}