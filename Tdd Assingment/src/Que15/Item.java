package Que15;

import java.time.LocalDate;

public class Item {
    private int itemid;
    private String itemname;
    private int costprice;
    private int sellprice;
    private LocalDate dom;
    private LocalDate doe;
    public Item(int itemid, String itemname, int costprice, int sellprice, LocalDate dom, LocalDate doe) {
        super();
        this.itemid = itemid;
        this.itemname = itemname;
        this.costprice = costprice;
        this.sellprice = sellprice;
        this.dom = dom;
        this.doe = doe;
    }
    Item i = null;
    public static boolean createObject(Item i) {
        if (countDigit(i.itemid)>=3)
             if (i.itemname.matches("[a-za-Z]-"))
           if (i.sellprice>0 && i.costprice>0)
           if(i.doe!=LocalDate.now())
               if(i.sellprice!=i.costprice)
                   i= new Item(i.itemid,i.itemname,i.costprice,i.sellprice,i.dom,i.dom);

            if(i!=null)
                return true;
            else
                return false;

    }
    public static int countDigit (int itemid) {
        int count=0;
        while(itemid>0) {
            count++;
            itemid/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Item i = new Item (1,"pen", 200,500,LocalDate.of(2022,11,23),LocalDate.of(2023, 2, 22));
        System.out.println(Item.createObject(i));

    }



}
