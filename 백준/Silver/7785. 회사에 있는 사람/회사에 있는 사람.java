import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
			String name = sc.next();
			String en = sc.next();
			
			if(en.equals("enter")) {
				set.add(name);
			}
			if(en.equals("leave")) {
				set.remove(name);
			}
		}
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i)).append('\n');
		}
        System.out.println(sb);
	}
}
