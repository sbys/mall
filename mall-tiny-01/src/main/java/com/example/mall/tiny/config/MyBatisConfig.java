package com.example.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.mall.tiny.mbg.mapper","com.example.mall.tiny.dao"})
public class MyBatisConfig {
}
