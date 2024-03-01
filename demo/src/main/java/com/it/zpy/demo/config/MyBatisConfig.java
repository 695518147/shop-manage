package com.it.zpy.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@MapperScan("com.it.zpy.mapper")
public class MyBatisConfig {
}
