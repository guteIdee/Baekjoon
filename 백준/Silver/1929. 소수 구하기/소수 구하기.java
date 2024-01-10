import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		//소수면 true, 아니면 false
		List<Boolean> primeList = new ArrayList<>();
		primeList.add(false); 	//0
		primeList.add(false);	//1
		
		for (int i = 2; i < n + 1; i++) {
			primeList.add(i, true);
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(primeList.get(i)) {
				for (int j = i * i; j <= n ; j += i) {
					primeList.set(j, false);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = m; i <= n; i++) {
			if(primeList.get(i))
				sb.append(i).append('\n');
		}
		System.out.println(sb);
		
	}
}
