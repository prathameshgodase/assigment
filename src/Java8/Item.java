package Java8;

import java.util.ArrayList;
import java.util.List;

//model class
class Item {
	int itemid;
	String itemname;
	float itemprice;
	
	public Item(int itemid, String itemname, float itemprice) {
		
		super();
		this.itemid =itemid;
		this.itemname=itemname;
		this.itemprice=itemprice;
		
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public float getItemprice() {
		return itemprice;
	}

	public void setItemprice(float itemprice) {
		this.itemprice = itemprice;
	}

}

