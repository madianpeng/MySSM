package top.madianpeng.service;

import top.madianpeng.entity.TbTeacher;

import java.util.List;

/**
 * 商品表(TbTeacher)表服务接口
 *
 * @author makejava
 * @since 2020-03-31 20:50:30
 */
public interface TbTeacherService {


    TbTeacher queryById(String id);


    boolean deleteById(String id);

}