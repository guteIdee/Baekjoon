import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
			int y = sc.nextInt();
			if(y == 1) {
				int x = sc.nextInt();
				stack.add(x);
			}
			else if(y == 2) {
				if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(stack.pop()).append('\n');
				}
			}
			else if(y == 3) {
				sb.append(stack.size()).append('\n');
			}
			else if(y == 4) {
				if(stack.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
			}
			else if(y == 5) {
				if(stack.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(stack.peek()).append('\n');
				}
			}
		}
        System.out.println(sb);
	}
}
