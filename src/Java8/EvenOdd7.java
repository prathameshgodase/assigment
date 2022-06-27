package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd7 {
	public static void main(String[] args) {
		List<Item> list=new ArrayList();
		list.add(new Item(1,"Pen",1209));
		list.add(new Item(2,"Pencil",100));
		list.add(new Item(3,"tv",120000));
		
		List<Float> check = list.stream().filter(i->i.itemprice % 2==0).map(i ->i.getItemprice()).collect(Collectors.toList());
	    System.out.println("Even number are="+check);
	}

}
