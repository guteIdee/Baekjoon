import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double M = 0;
		List<Double> list = new ArrayList<>();
		double total = 0;
		
		for (int i = 0; i < n; i++) {
			double x = scanner.nextDouble();
			list.add(x);
			if(x > M) M = x;
		}
		
		for (int i = 0; i < n; i++) {
			list.set(i, (list.get(i) / M) * 100.0);
			total += list.get(i);
		}
		
		System.out.println(total / (double) n);
	}
}
