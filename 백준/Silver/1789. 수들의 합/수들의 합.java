import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long S = scanner.nextLong();
		int i = 1;
		long sum = 0;
		while(true) {
			sum += i;
			if(sum > S)
				break;
			i++;
		}
		System.out.println(i - 1);
	}
}
