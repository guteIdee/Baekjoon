import java.util.Scanner;
import java.util.*;

public class Main {	//mobitel bometil
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		List<String> list = new ArrayList<>();
		
		for (int i = 1; i < word.length(); i++) {
			String first = word.substring(0, i);
			StringBuffer fir = new StringBuffer(first).reverse();
			
			for (int j = i + 1; j < word.length(); j++) {
				String second = word.substring(i, j);
				StringBuffer sec = new StringBuffer(second).reverse();
				String third = word.substring(j, word.length());
				StringBuffer thi = new StringBuffer(third).reverse();
				
				String str = fir.toString() + sec.toString() + thi.toString();
				
				list.add(str);
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
	}	
}	