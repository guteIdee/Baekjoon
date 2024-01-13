import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		int x = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			
			if(str.equals("push")) {
				x = scanner.nextInt();
				queue.offer(x);
			}
			if(str.equals("pop")) {
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(queue.poll()).append('\n');
			}
			if(str.equals("size")) sb.append(queue.size()).append('\n');
			if(str.equals("empty")) {
				if(queue.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
			}
			if(str.equals("front")) {
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(queue.peek()).append('\n');
			}
			if(str.equals("back")) {
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(x).append('\n');
			}
		}
		System.out.println(sb);
	}
}
