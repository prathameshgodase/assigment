package Java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer>marklist=new ArrayList<>();
		System.out.println("enter any 5 number");
		
		for(int i=0; i<=4;i++) {
			int a=sc.nextInt();
			marklist.add(a);
			
		}
		
		List<Integer> distinct_num=marklist.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct numbers from list :-");
		for(int num:distinct_num) {
			System.out.println(num+"");
		}
	}
}
