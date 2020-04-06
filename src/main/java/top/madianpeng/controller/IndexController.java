package top.madianpeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static String HomePage = "home/console";


    @RequestMapping("/")
    public String mainIndex(){
        return "index";
    }

    @RequestMapping("/home")
    public String homePage(){
        return HomePage;
    }
}
