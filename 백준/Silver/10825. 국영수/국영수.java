import java.io.*;
import java.util.*;

class Grade implements Comparable<Grade>{
	String name;
	int kor;
	int eng;
	int math;
	
	Grade(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int compareTo(Grade o) {
		if(this.kor != o.kor)
			return o.kor - this.kor;
		else if(this.kor == o.kor && o.eng != this.eng) {
			return this.eng - o.eng;
		}
		else if(this.eng == o.eng && this.math != o.math) {
			return o.math - this.math;
		}
		else {
			return this.name.compareTo(o.name);
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<Grade> set = new TreeSet<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			set.add(new Grade(name, kor, eng, math));
		}
		
		StringBuilder sb = new StringBuilder();
		for (Grade grade : set) {
			sb.append(grade).append('\n');
		}
		System.out.println(sb);
	}
}

