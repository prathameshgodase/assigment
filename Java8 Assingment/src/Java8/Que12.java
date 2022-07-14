package Java8;

import java.util.ArrayList;
import java.util.List;

public class Que12 {
	
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		Max u=(int a[])->{
			for(int i=1; i<a.length; i++) {
				list.add(a[i]);
			}
			Integer Maximum = list.stream().max((e1,e2)->e1>e2 ? 1 : -1).get();
			System.out.println("maximum number in Array="+Maximum);
		};
		u.maxArray(new int[] {76,898,678,98,56});
	}

}
