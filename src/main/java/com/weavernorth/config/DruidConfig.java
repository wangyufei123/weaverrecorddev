package com.weavernorth.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: alibaba Druid数据源配置文件
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 13:18
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 13:18
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Configuration
public class DruidConfig {
    /*
    * dataSource的数据源重写
    * */
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource getDataSource(){
        return new DruidDataSource();
    }
    /*
    * 配置druid的数据源后台管理登陆路径
    * */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid" +
                "/*" );
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","localhost");
        //initMap.put("loginPassword","admin");
        bean.setInitParameters(initParams);
        return bean;
    }

    /*
    * 配置druid的Fileter过滤器
    * */
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
