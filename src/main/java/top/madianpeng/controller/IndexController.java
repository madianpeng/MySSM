package top.madianpeng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import top.madianpeng.entity.Menu;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static String HomePage = "home/console";
    private static String Page1 = "home/homepage1";
    private static String Page2 = "home/homepage2";


    @RequestMapping("/")
    public String mainIndex(ModelMap map){
        List<Menu> menuList = new ArrayList<>();
        try {
            Menu menu1 = new Menu();
            menu1.setName("主页");
            menu1.setUrl("/home");
            menu1.setIcon("layui-icon layui-icon-home");

            menuList.add(menu1);

            Menu menu2 = new Menu();
            menu2.setName("其他页");
            menu2.setIcon("layui-icon layui-icon-component");

            List<Menu> menuList1 = menu2.getcList();
            Menu menu3 = new Menu();
            menu3.setName("主页1");
            menu3.setUrl("/page1");
            Menu menu4 = new Menu();
            menu4.setName("主页2");
            menu4.setUrl("/page2");
            menuList1.add(menu3);
            menuList1.add(menu4);

            menu2.setcList(menuList1);

            menuList.add(menu2);
        } catch (Exception e) {
            logger.error("错误异常：{}",e);
        }
        map.put("menuList",menuList);

        return "index";
    }

    @RequestMapping("/home")
    public String homePage(){
        return HomePage;
    }

    @RequestMapping("/page1")
    public String page1(){
        return Page1;
    }

    @RequestMapping("/page2")
    public String page2(){
        return Page2;
    }
}
