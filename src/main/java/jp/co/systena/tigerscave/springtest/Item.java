package jp.co.systena.tigerscave.springtest;

public class Item {
  private int  itemid,price;
  private String name;

  public void setname(String name){
    this.name = name;
  }
  public String getname(){
    return this.name;
  }

  public void setitemid(int itemid){
    this.itemid = itemid;
  }
  public int  getitemid(){
    return this.itemid;
  }

  public void setprice(int price){
    this.price = price;
  }
  public int getprice(){
    return this.price;
  }
}
