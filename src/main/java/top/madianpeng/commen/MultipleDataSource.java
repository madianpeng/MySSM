package top.madianpeng.commen;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 说明:
 *
 * @author: madp
 * @create: 2020-04-03 13:47
 **/

public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}