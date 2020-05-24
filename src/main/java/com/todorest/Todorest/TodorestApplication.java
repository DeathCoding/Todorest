package com.todorest.Todorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TodorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodorestApplication.class, args);
	}


}
