package top.madianpeng.service.impl;

import org.springframework.stereotype.Service;
import top.madianpeng.commen.MultipleDataSource;
import top.madianpeng.entity.TbItem;
import top.madianpeng.entity.TbTeacher;
import top.madianpeng.mapper.TbItemMapper;
import top.madianpeng.mapper.TbTeacherMapper;
import top.madianpeng.service.TbItemService;
import top.madianpeng.service.TbTeacherService;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品表(TbItem)表服务实现类
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
@Service("tbTeacherService")
public class TbTeacherServiceImpl implements TbTeacherService {
    @Resource
    private TbTeacherMapper tbTeacherMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param tno 主键
     * @return 实例对象
     */
    @Override
    public TbTeacher queryById(String tno) {
        //MultipleDataSource.setDataSourceKey("dataSource2");
        return this.tbTeacherMapper.queryById(tno);
    }


    /**
     * 通过主键删除数据
     *
     * @param tno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String tno) {
        return this.tbTeacherMapper.deleteById(tno) > 0;
    }
}