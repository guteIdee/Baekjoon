import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				queue.add(queue.poll());
			}
			if(queue.size() == 1) {
				sb.append(queue.poll()).append(">");
			}
			else {

				sb.append(queue.poll()).append(", ");
			}
		}
		System.out.println(sb);
	}
}
