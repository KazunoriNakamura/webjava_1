package jp.co.systena.tigerscave.springtest;

public class ListForm{
  private Item  item;
  private int  num,price,itemid;
  private String name;

  public void setitem(Item item){
    this.item = item;
  }
  public Item getitem(){
    return this.item;
  }

  public void setnum(int num){
    this.num = num;
  }
  public int  getnum(){
    return this.num;
  }

  public void setprice(int price){
    this.price = price;
  }
  public int  getprice(){
    return this.price;
  }

  public void setitemid(int itemid){
    this.itemid = itemid;
  }
  public int  getitemid(){
    return this.itemid;
  }

  public void setname(String name){
    this.name = name;
  }
  public String  getname(){
    return this.name;
  }

}
