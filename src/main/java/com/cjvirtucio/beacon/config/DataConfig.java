package com.cjvirtucio.beacon.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


@Configuration
@MapperScan("com.cjvirtucio.beacon.mapper")
public class DataConfig {

    @Value("${env}")
    private String env;

    @Value("classpath:com/cjvirtucio/beacon/sql/drop.sql")
    private Resource dropScript;

    @Value("classpath:com/cjvirtucio/beacon/sql/district.sql")
    private Resource districtScript;

    @Value("classpath:com/cjvirtucio/beacon/sql/crime.sql")
    private Resource crimeScript;

    @Value("classpath:com/cjvirtucio/beacon/sql/crime.seed.sql")
    private Resource crimeSeedScript;

    @Value("classpath:com/cjvirtucio/beacon/sql/hospital.sql")
    private Resource hospitalScript;

    @Value("classpath:com/cjvirtucio/beacon/sql/hospital.seed.sql")
    private Resource hospitalSeedScript;

    @Bean
    public DataSource beaconDb() throws IOException {
        Properties props = new Properties();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream is = classLoader.getResourceAsStream("com/cjvirtucio/beacon/config/beacondb." + env + ".properties");
        props.load(is);
        return new DriverManagerDataSource(
                props.getProperty("url"),
                props
        );
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws IOException {
        return new DataSourceTransactionManager(beaconDb());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(beaconDb());
        return sessionFactory.getObject();
    }

    @Bean
    public DatabasePopulator databasePopulator() {
        final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScripts(dropScript, districtScript, crimeScript, crimeSeedScript, hospitalScript, hospitalSeedScript);
        populator.setSeparator("$$");
        return populator;
    }

    @PostConstruct
    protected void initialize() throws IOException {
        DatabasePopulatorUtils.execute(databasePopulator(), beaconDb());
    }

}
