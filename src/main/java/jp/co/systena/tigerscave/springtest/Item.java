package jp.co.systena.tigerscave.springtest;

public class Item {
  private int  itemid = 0;
  private int  price = 1000;
  private String name = "虎の穴入門";

  public void setname(String name){ //privateの変数へ値をセットするためのメソッド（セッター）
    this.name = name; //this.nameは自分のクラスのnameを表す。ただのnameは引数のname。
  }
  public String getname(){ //privateの変数の値を取得するためのメソッド（ゲッター）
    return this.name;
  }

  public void setitemid(int itemid){ //privateの変数へ値をセットするためのメソッド（セッター）
    this.itemid = itemid; //this.nameは自分のクラスのnameを表す。ただのnameは引数のname。
  }
  public int  getitemid(){ //privateの変数の値を取得するためのメソッド（ゲッター）
    return this.itemid;
  }

  public void setprice(int price){ //privateの変数へ値をセットするためのメソッド（セッター）
    this.price = price; //this.nameは自分のクラスのnameを表す。ただのnameは引数のname。
  }
  public int getprice(){ //privateの変数の値を取得するためのメソッド（ゲッター）
    return this.price;
  }
}
