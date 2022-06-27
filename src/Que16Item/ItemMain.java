package Que16Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ItemMain {
	public static void main(String[] args) {
		List<Item>item=new ArrayList<>();
		item.add(new Item("Laptop","Electronics",45000,LocalDate.of(2022, 01,21),null));
		item.add(new Item("Headphone","Electronics",1500,LocalDate.of(2022, 05,20),null));
		item.add(new Item("Chpips","Snaks",100,LocalDate.of(2022, 01,21),LocalDate.of(2023, 01,10)));
		item.add(new Item("Tablets","Medicine",2300,LocalDate.of(2022, 01,01),LocalDate.of(2024, 11,11)));
		item.add(new Item("Thumpsup","Softdrinks",90,LocalDate.of(2022, 01,01),LocalDate.of(2023, 01,01)));


		// list with name of catagory
		System.out.println("Enter Catagory:");
		Scanner sc=new Scanner(System.in);
		String catagory=sc.next();
		List<Item> list=item.stream().filter(e->e.category.equals(catagory)).collect(Collectors.toList());
		for (Item  item1:list) {
			System.out.println("Item Name: "+item1.iname+"price:"+item1.price+"Date Of MAnufacturing:"+item1.dom+"Date OF Expiry:"+item1.eom);	
		}
         //
		System.out.println("Enter the Staring letter of Item");
		String str=sc.next();
		List<Item> item2=item.stream().filter(e ->e.iname.startsWith(str.toLowerCase())).collect(Collectors.toList());
		
		for (Item  item3:item2) {
			System.out.println("Item Name: "+item3.iname+"category "+item3.category+"price="+item3.price+"Date Of MAnufacturing"+item3.dom+"Date OF Expiry"+item3.eom);	
		}
	}

}
