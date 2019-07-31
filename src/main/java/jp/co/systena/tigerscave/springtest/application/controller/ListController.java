package jp.co.systena.tigerscave.springtest.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import jp.co.systena.tigerscave.springtest.Item;
import jp.co.systena.tigerscave.springtest.ListService;

@Controller // Viewあり。Viewを返却するアノテーション
public class ListController {
  int itemid,price;
  String name;
  @RequestMapping("/Show") // URLとのマッピング
  public String show(Model model) {
    ListService listservice = new ListService();
    Item data = new Item();
    listservice.getItemList(data);
    name = data.getname();
    itemid = data.getitemid();
    price = data.getprice();
    model.addAttribute("itemid", itemid);
    model.addAttribute("name", name);
    model.addAttribute("price", price);
    return "ListView";
  }
}
