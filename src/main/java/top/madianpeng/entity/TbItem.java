package top.madianpeng.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品表(TbItem)实体类
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
public class TbItem implements Serializable {
    private static final long serialVersionUID = 660204321935457238L;
    /**
    * 商品id，同时也是商品编号
    */
    private Long id;
    /**
    * 商品标题
    */
    private String title;
    /**
    * 商品卖点
    */
    private String sellPoint;
    /**
    * 商品价格，单位为：分
    */
    private Long price;
    /**
    * 库存数量
    */
    private Integer num;
    /**
    * 商品条形码
    */
    private String barcode;
    /**
    * 商品图片
    */
    private String image;
    /**
    * 所属类目，叶子类目
    */
    private Long cid;
    /**
    * 商品状态，1-正常，2-下架，3-删除
    */
    private Object status;
    /**
    * 创建时间
    */
    private Date created;
    /**
    * 更新时间
    */
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}