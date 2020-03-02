package com.weavernorth.config;

import com.weavernorth.filter.CrosFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @Description: java类作用描述
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 14:21
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 14:21
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Configuration
public class CrosConfig {

    @Bean
    public FilterRegistrationBean crosFilterConfig(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new CrosFilter());
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}
