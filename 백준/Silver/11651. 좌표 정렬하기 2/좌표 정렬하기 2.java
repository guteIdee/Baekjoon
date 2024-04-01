import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[][] arr = new Integer[n][2];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[1] < o2[1]) {
					return -1;
				}
				else if(o1[1] > o2[1]) {
					return 1;
				}
				else {
					if(o1[0] < o2[0]) {
						return -1;
					}
					else
						return 1;
				}
			}
		});
		
		for (int i = 0; i < n; i++) {
			if(i == n-1)
				System.out.print(arr[i][0] + " " + arr[i][1]);
			else {
				System.out.println(arr[i][0] + " " + arr[i][1]);
			}
		}
			
		
	}
}
