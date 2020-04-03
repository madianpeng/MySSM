package top.madianpeng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.madianpeng.entity.TbTeacher;
import top.madianpeng.service.TbTeacherService;

/**
 * 说明:
 *
 * @author: madp
 * @create: 2020-04-03 13:40
 **/

public class Test {

    @org.junit.Test
    public void commenTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/springmvc.xml");
        TbTeacherService tbTeacherService = applicationContext.getBean("tbTeacherService", TbTeacherService.class);
        TbTeacher tbTeacher = tbTeacherService.queryById("1");
        System.out.printf(tbTeacher.toString());
    }
}
