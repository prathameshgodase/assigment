package Java8;

import java.util.function.Predicate;

public class PredicateArrayEvenCnt {
	
	public static void main(String[] args) {
		
		int[] arr= {45,36,45,67,88,78,98,57};
		int evencnt=0, oddcnt = 0;
		
		Predicate<Integer>checkeven = num->num%2==0 ;
		
		for(int i=0;i<arr.length;i++) {
			if(checkeven.test(arr[i])) {
				evencnt++;
				
			}
			else
				oddcnt++;
		}
		System.out.println("Total even numbers in array"+ evencnt);
		System.out.println("Total odd numbers in array"+ oddcnt);
	}

}
