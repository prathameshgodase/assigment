package Que16Item;

import java.time.LocalDate;

public class Item {
	String iname ;
	String category;
	float price;
	LocalDate dom;
	LocalDate eom;
	
	public Item(String iname, String category, float price, LocalDate dom, LocalDate eom) {
		super();
		this.iname = iname;
		this.category = category;
		this.price = price;
		this.dom = dom;
		this.eom = eom;
	}

	
}
