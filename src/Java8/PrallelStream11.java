package Java8;

import java.util.Arrays;
import java.util.List;

public class PrallelStream11 {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4);
		list.parallelStream().forEach(m->System.out.print(m+""));
	}
}
