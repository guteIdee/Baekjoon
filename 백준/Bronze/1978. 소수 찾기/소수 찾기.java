import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Boolean> primeList = new ArrayList<>();
		primeList.add(false); 	//0
		primeList.add(false);	//1
				
		for (int i = 2; i < 1000 + 1; i++) {
				primeList.add(i, true);
		}
				
		for (int i = 2; i <= Math.sqrt(1000); i++) {
				if(primeList.get(i)) {
					for (int j = i * i; j <= 1000 ; j += i) {
						primeList.set(j, false);
					}
				}
		}
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			if(primeList.get(x)) cnt++;
		}
		System.out.println(cnt);
	}
}
