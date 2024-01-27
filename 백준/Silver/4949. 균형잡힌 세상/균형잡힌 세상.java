import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = sc.nextLine();
			
			if(str.equals(".")) {
				break;
			}
			
			Stack<Character> stack = new Stack<>();
			
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(' || str.charAt(i) == '[')
					stack.push(str.charAt(i));
				
				else if(str.charAt(i) == ')') {
					if(!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					}
					else
						stack.push(str.charAt(i));
				}
				
				else if(str.charAt(i) == ']') {
					if(!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					}
					else
						stack.push(str.charAt(i));
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("yes").append('\n');
			}
			else {
				sb.append("no").append('\n');
			}
		}
		System.out.println(sb);
	}
}
