import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			String str = scanner.next();
			if(str.equals("push")) {
				int x = scanner.nextInt();
				stack.add(x);
			}
			if(str.equals("pop")) {
				if(stack.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.pop()).append('\n');
			}
			if(str.equals("size"))
				sb.append(stack.size()).append('\n');
			if(str.equals("empty")) {
				if(stack.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
			}
			if(str.equals("top")) {
				if(stack.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(stack.peek()).append('\n');
			}
		}
		
		System.out.print(sb);
		
	}
}
