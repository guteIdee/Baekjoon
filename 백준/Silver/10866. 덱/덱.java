import java.util.*;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Deque<Integer> deque = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			if(str.equals("push_front")) {
				int x = sc.nextInt();
				deque.addFirst(x);
			}
			else if(str.equals("push_back")) {
				int x = sc.nextInt();
				deque.add(x);
			}
			else if(str.equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(deque.pollFirst()).append('\n');
				}
			}
			else if(str.equals("pop_back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(deque.pollLast()).append('\n');
				}
			}
			else if(str.equals("size")) {
				sb.append(deque.size()).append('\n');
			}
			else if(str.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
			}
			else if(str.equals("front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(deque.peekFirst()).append('\n');
				}
			}
			else if(str.equals("back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(deque.peekLast()).append('\n');
				}
			}
		}
		System.out.println(sb);
	}
	
}
