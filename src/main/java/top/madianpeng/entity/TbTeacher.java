package top.madianpeng.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表(TbItem)实体类
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
public class TbTeacher implements Serializable {
    private static final long serialVersionUID = 660204321935457239L;
    /**
    * 商品标题
    */
    private String tno;

    /**
    * 商品卖点
    */
    private String tname;

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "TbTeacher{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}