package jp.co.systena.tigerscave.springtest.application.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.springtest.Item;
import jp.co.systena.tigerscave.springtest.ListForm;
import jp.co.systena.tigerscave.springtest.ListService;
import jp.co.systena.tigerscave.springtest.jp.co.systena.tigerscave.springtest.application.model.Cart;
import jp.co.systena.tigerscave.springtest.jp.co.systena.tigerscave.springtest.application.model.Order;

@Controller // Viewあり。Viewを返却するアノテーション
public class ListController {
  @Autowired
  HttpSession session;

  int itemid,price;
  String name;
  @RequestMapping("/Show") // URLとのマッピング
  public String show(Model model) {
    /*
    ListService listservice = new ListService();
    model.addAttribute("itemlist", listservice.getItemList());
    */
    ListService listservice = new ListService();
    Item item = new Item();
    item = listservice.getItemList();
    model.addAttribute("itemid", item.getitemid());
    model.addAttribute("price", item.getprice());
    model.addAttribute("name", item.getname());
    model.addAttribute("item", item);

    return "ListView";
  }

  @RequestMapping(value = {"/Order"}, method = {RequestMethod.POST})
  public ModelAndView order(Model model,
          @ModelAttribute ListForm form) {

      // セッションへ保存
      session.setAttribute("form", form);

      // Cartにセッションから取り出して保存
      Order order = new Order(form.getitemid(),form.getnum());
      Cart cart = new Cart();
      cart.ordarList.add(order);

      // 注文を画面上に表示

      // 商品
      model.addAttribute("orderitem", form.getitem());

      // 個数
      model.addAttribute("ordernum", form.getnum());

      // 金額
      int amount = form.getnum() * form.getprice();
      model.addAttribute("amount", amount);

      return new ModelAndView("redirect/");
  }

}
