//package com.pluralsight.conferencedemo.config;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
////This configuration is overriding the config in application.properties for the datasource info.
//@Configuration
//public class PersistenceConfiguration {
//    @Bean
//    public DataSource datasource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/");
//        builder.username("postgres");
//        builder.password("mysecretpassword");
//        System.out.println("My custom datasource bean has been initialized and set.");
//        return builder.build();
//    }
//}
