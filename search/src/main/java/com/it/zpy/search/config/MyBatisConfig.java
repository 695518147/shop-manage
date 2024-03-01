package com.it.zpy.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.it.zpy.mapper", "com.it.zpy.search.dao"})
public class MyBatisConfig {
}
