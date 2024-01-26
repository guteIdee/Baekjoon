import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Set<String> set = new HashSet<>();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			set.add(str);
		}
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		int no = 0;
		for (int i = 0; i < M; i++) {
			String str = sc.nextLine();
			if(set.contains(str)) {
				list.add(str);
				no++;
			}
		}
		Collections.sort(list);
		for (String string : list) {
			sb.append(string).append('\n');
		}
		
		System.out.println(no);
		System.out.println(sb);
	}
}
