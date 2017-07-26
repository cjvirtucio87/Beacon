package com.cjvirtucio.beacon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;


@Configuration
@MapperScan("com.cjvirtucio.beacon.mapper")
public class DataConfig {
}
