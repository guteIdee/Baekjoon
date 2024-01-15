import java.util.*;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()) {
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if(a == b && c == 0 && b == 0) break;
			
			
			if((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {
				sb.append("right").append('\n');
			}
			else
				sb.append("wrong").append('\n');
		}
		System.out.println(sb);
	}
}
