package top.madianpeng.service.impl;

import top.madianpeng.entity.TbItem;
import top.madianpeng.mapper.TbItemMapper;
import top.madianpeng.service.TbItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表(TbItem)表服务实现类
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
@Service("tbItemService")
public class TbItemServiceImpl implements TbItemService {
    @Resource
    private TbItemMapper tbItemMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbItem queryById(Long id) {
        return this.tbItemMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TbItem> queryAllByLimit(int offset, int limit) {
        return this.tbItemMapper.queryAllByLimit(offset, limit);
    }

    /**
     *根据实体查询
     *
     * @param tbItem 实例对象
     * @return 对象列表
     */
    @Override
    public List<TbItem> queryAll(TbItem tbItem) {
        return this.tbItemMapper.queryAll(tbItem);
    }

    /**
     * 新增数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem insert(TbItem tbItem) {
        this.tbItemMapper.insert(tbItem);
        return tbItem;
    }

    /**
     * 修改数据
     *
     * @param tbItem 实例对象
     * @return 实例对象
     */
    @Override
    public TbItem update(TbItem tbItem) {
        this.tbItemMapper.update(tbItem);
        return this.queryById(tbItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tbItemMapper.deleteById(id) > 0;
    }
}