package jp.co.systena.tigerscave.springtest;

public class ListService {

  public Item getItemList()
  {
    Item item1 = new Item();
    item1.setname("虎の穴入門");
    item1.setitemid(12345);
    item1.setprice(1000);

//    ArrayList<Item> itemlist = new ArrayList<Item>();
//    itemlist.add(item1);

    return item1;
  }

}
