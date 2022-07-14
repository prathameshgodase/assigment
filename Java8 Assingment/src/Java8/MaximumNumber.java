package Java8;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
	public static void main(String[] args) {
		
		List<Integer> slist=Arrays.asList(32,34,56,76,87);
		Integer j= slist.stream().max(Integer::compare).get();
		System.out.println("maximum number of list is "+j);
		System.out.println("=============");
		Integer e3=slist.stream().max((e1, e2) -> e1.intValue()>e2.intValue()?1:-1).get();
		System.out.println("Maximum number="+e3);
	}

}
