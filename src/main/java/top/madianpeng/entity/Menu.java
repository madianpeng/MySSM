package top.madianpeng.entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private String url;

    private String icon;

    private List<Menu> cList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Menu> getcList() {
        return cList;
    }

    public void setcList(List<Menu> cList) {
        this.cList = cList;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
