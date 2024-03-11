import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			stack.add(str.charAt(0));
			for (int j = 1; j < str.length(); j++) {
				if(!stack.isEmpty()) {
					if(str.charAt(j) == stack.peek()) {
						stack.pop();
					}
					else {
						stack.push(str.charAt(j));
					}
				}
				else {
					stack.push(str.charAt(j));
				}
			}
			
			if(stack.isEmpty()) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}

