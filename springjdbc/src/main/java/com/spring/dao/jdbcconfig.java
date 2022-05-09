package com.spring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.dao.jdbc.old.studentdao;
import com.spring.dao.jdbc.old.studentdaoimpl;

@Configuration
@ComponentScan(basePackages={" com.spring.dao.jdbc.old"})
public class jdbcconfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/mydb");
		ds.setUsername("root");
		ds.setPassword("database");
		return ds;
	}
	
	
	@Bean("jdbc")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

//	@Bean("studentdao")
//	public studentdao getstudentdao() 
//	{
//		 studentdaoimpl sdo=new studentdaoimpl();
//		 sdo.setJdbcTemplate(getTemplate());
//		 return sdo;
		 
//	}
}
