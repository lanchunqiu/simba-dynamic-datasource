package com.simba.commons.dynamic.datasource.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 多数据源属性
 * @author lancq
 */
@ConfigurationProperties(prefix = "dynamic")
public class DynamicDataSourceProperties {

    public Map<String, DataSourceProperties> getDatasource() {
        return dataSource;
    }

    public void setDatasource(Map<String, DataSourceProperties> datasource) {
        this.dataSource = datasource;
    }

    private Map<String, DataSourceProperties> dataSource = new LinkedHashMap();
}
