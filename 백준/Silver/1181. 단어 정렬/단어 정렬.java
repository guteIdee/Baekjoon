import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] arr = new String[N];
		
		scanner.nextLine();
		
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextLine();
		}

		Arrays.sort(arr, new Comparator<String>( ) {
			@Override
			public int compare(String str1, String str2) {
				if(str1.length() != str2.length()) {
					return str1.length()-str2.length();
				}
				else {
					return str1.compareTo(str2);
				}
			}
		});
		for (int i = 0; i < arr.length; i++) {
			if(i > 0 && arr[i-1].equals(arr[i]))
				continue;
			System.out.println(arr[i]);
		}
			
	}	
}	
	


