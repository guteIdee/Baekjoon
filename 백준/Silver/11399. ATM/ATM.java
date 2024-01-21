import java.util.*;

public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list.add(x);
		}
        Collections.sort(list);
        int sum = list.get(0);
        for (int i = 1; i < n; i++) {
			list.set(i, list.get(i) + list.get(i - 1));
			sum += list.get(i);
		}
        System.out.println(sum);
        
	}
}
