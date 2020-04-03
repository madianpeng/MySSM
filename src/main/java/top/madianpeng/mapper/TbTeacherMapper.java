package top.madianpeng.mapper;

import org.apache.ibatis.annotations.Param;
import top.madianpeng.entity.TbTeacher;

import java.util.List;

/**
 * 商品表(TbTeacher)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
public interface TbTeacherMapper {


    TbTeacher queryById(String  tno);

    int deleteById(String tno);

}