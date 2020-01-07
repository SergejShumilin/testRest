package com.epam.esm.dao.connection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBWorker {

    public static JdbcTemplate getJdbcTemplate(){
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/gift_certificates?serverTimezone=Europe/Moscow&allowPublicKeyRetrieval=true&useSSL=false");
            dataSource.setUsername("root");
            dataSource.setPassword("12345");
            return new JdbcTemplate(dataSource);
    }

}
