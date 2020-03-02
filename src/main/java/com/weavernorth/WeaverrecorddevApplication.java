package com.weavernorth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用@MapperScan扫描com.weavernorth.mapper包下的文件,以方便不经常在对应的类上写Mapper注解
 */
@MapperScan(value = "com.weavernorth.mapper")
@SpringBootApplication
public class WeaverrecorddevApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeaverrecorddevApplication.class, args);
    }

}
