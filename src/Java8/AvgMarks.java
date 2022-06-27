package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AvgMarks {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer>marklist = new ArrayList<>();
		System.out.println("enter any 5 number");
		
		for(int i=0; i<=4; i++)
		{
			int a=sc.nextInt();
			marklist.add(a);
			
		}
		double avg = marklist.stream().collect(Collectors.averagingDouble(e->e));
		System.out.println("avg of marks" +avg);
	}
}
