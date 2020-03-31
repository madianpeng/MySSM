package top.madianpeng.controller;

import org.springframework.stereotype.Controller;
import top.madianpeng.entity.TbItem;
import top.madianpeng.service.TbItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 商品表(TbItem)表控制层
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
@Controller
@RequestMapping("/tbItem")
public class TbItemController {
    /**
     * 服务对象
     */
    @Resource
    private TbItemService tbItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/selectOne")
    @ResponseBody
    public TbItem selectOne(Long id) {
        return this.tbItemService.queryById(id);
    }

}