import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		
		Set<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			String str = scanner.next();
			if(str.equals("add")) {
				int x = scanner.nextInt();
				set.add(x);
			}
			if(str.equals("remove")) {
				int x = scanner.nextInt();
				set.remove(x);
			}
			if(str.equals("check")) {
				int x = scanner.nextInt();
				if(set.contains(x))
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
			}
			if(str.equals("toggle")) {
				int x = scanner.nextInt();
				if(set.contains(x))
					set.remove(x);
				else
					set.add(x);
			}
			if(str.equals("all")) {
				set.clear();
				for (int j = 1; j <= 20; j++) {
					set.add(j);
				}
			}
			if(str.equals("empty")) {
				set.clear();
			}
		}
		System.out.println(sb);
	}
}
