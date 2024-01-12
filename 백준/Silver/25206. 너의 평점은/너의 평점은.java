import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String lecture;
		double credit;
		String grade;
		
		double totalGrade = 0;
		double totalCredit = 0;
		
		for (int i = 0; i < 20; i++) {
			lecture = scanner.next();
			credit = scanner.nextDouble();
			grade = scanner.next();
			
			if(!grade.equals("P")) {
				totalCredit += credit;
				
				if(grade.equals("A+")) totalGrade += credit * 4.5;
				if(grade.equals("A0")) totalGrade += credit * 4.0;
				if(grade.equals("B+")) totalGrade += credit * 3.5;
				if(grade.equals("B0")) totalGrade += credit * 3.0;
				if(grade.equals("C+")) totalGrade += credit * 2.5;
				if(grade.equals("C0")) totalGrade += credit * 2.0;
				if(grade.equals("D+")) totalGrade += credit * 1.5;
				if(grade.equals("D0")) totalGrade += credit * 1.0;
				if(grade.equals("F")) totalGrade += credit * 0.0;
			}
		}
		System.out.println(totalGrade / totalCredit);
		
	}
}
