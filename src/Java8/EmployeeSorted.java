package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeSorted {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		List<String> marklist =new ArrayList<>();
		System.out.println("enter any 5 employee name");
		
		for(int i=0; i<=4; i++) {
			String a=sc.next();
			marklist.add(a);
		}
		
		List<String>distinct_num=marklist.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("distinct numbers from list :-");
		for(String num:distinct_num) {
			System.out.println(num+"");
		}
	}
}
