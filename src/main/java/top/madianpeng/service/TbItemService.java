package top.madianpeng.service;

import top.madianpeng.entity.TbItem;
import java.util.List;

/**
 * 商品表(TbItem)表服务接口
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
public interface TbItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItem queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TbItem> queryAllByLimit(int offset, int limit);

  /**
     * 根据实体查询
     *
     * @param tbItem 实例对象
     * @return 对象列表
     */
    List<TbItem> queryAll(TbItem tbItem);

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    TbItem insert(TbItem tbItem);

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    TbItem update(TbItem tbItem);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}