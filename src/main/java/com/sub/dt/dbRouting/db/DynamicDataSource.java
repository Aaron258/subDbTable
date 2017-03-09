package com.sub.dt.dbRouting.db;


import com.sub.dt.dbRouting.DbContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import java.util.logging.Logger;

/**
 * SPring 的动态数据源的实现
 * @ClassName: DynamicDataSource 
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    public static final Logger logger = Logger.getLogger(DynamicDataSource.class.toString());
    @Override
    protected Object determineCurrentLookupKey() {
    	return DbContextHolder.getDbKey();//获取当前数据源
    }

}