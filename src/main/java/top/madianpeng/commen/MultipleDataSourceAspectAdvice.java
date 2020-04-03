package top.madianpeng.commen;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 说明:
 *
 * @author: madp
 * @create: 2020-04-03 14:31
 **/

@Aspect
public class MultipleDataSourceAspectAdvice {

    @Around("execution(* top.madianpeng.service..*.*(..))")
    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
        /*if (jp.getTarget() instanceof MySqlMapper) {
            MultipleDataSource.setDataSourceKey("mySqlDataSource");
        } else if (jp.getTarget() instanceof SqlServerMapper) {
            MultipleDataSource.setDataSourceKey("sqlServerDataSource");
        }*/
        /*MultipleDataSource.setDataSourceKey("dataSource2");*/
        return jp.proceed();
    }
}
