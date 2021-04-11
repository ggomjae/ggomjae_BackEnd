//package com.ggomjae.gom.moduleqbscheduler.datasource;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//
//@Slf4j
//@Configuration
//public class DataSourceConfig {
//
//    @PostConstruct
//    public void init(){
//        log.info("driverClassName : {}",this.customDriverClassName);
//        log.info("URL : {}",this.customJdbcUrl);
//        log.info("UserName : {}",this.customJdbcUsername);
//        log.info("Password : {}",this.customJdbcPassword);
//    }
//
//    @Value("${custom.datasource.driverClassName}")
//    private String customDriverClassName;
//
//    @Value("${custom.datasource.url}")
//    private String customJdbcUrl;
//
//    @Value("${custom.datasource.username}")
//    private String customJdbcUsername;
//
//    @Value("${custom.datasource.password}")
//    private String customJdbcPassword;
//
//    @Primary
//    @Bean
//    public DataSource customDataSource() {
//        return getDataSource(customDriverClassName, customJdbcUrl, customJdbcUsername, customJdbcPassword);
//    }
//
//    private DataSource getDataSource(String externalDriverClassName, String externalJdbcUrl, String externalJdbcUsername, String externalJdbcPassword) {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(externalDriverClassName);
//        dataSource.setUrl(externalJdbcUrl);
//        dataSource.setUsername(externalJdbcUsername);
//        dataSource.setPassword(externalJdbcPassword);
//
//        return dataSource;
//    }
//}