import java.util.*;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			
			if(str.equals("0")) {
				break;
			}
			
			StringBuffer reverse = new StringBuffer(str).reverse();
			
			if(str.equals(reverse.toString())) {
				sb.append("yes").append('\n');
			}
			else {
				sb.append("no").append('\n');
			}
		}
		System.out.println(sb);
	}
	
}
