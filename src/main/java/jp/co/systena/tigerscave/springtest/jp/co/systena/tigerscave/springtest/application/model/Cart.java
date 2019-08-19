package jp.co.systena.tigerscave.springtest.jp.co.systena.tigerscave.springtest.application.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Cart {
  public List<Order> orderList = new ArrayList<Order>();

  public List<Order> getOrderList() {
    return this.orderList;
  }

  public void add(Order order) {
    orderList.add(order);
    Map<Integer, Order> map = new LinkedHashMap<Integer, Order>();
    map.put(order.getItemid(), order);
    for (Order o : orderList) {
        if (!map.containsKey(o.getItemid())) {
          orderList.add(order);
          break;
        }
        else {
          int num = map.get(o.getItemid()).getNum();
          map.get(o.getItemid()).setNum(num + o.getNum());
        }
    }
  }
}
