package com.spring.dao.jdbc.old;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.dao.entity.student;

@Component("studentdao")
public class studentdaoimpl implements studentdao {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(student s) {
		// Insert query
		
		String query= " insert into stud (id,name,city) values (?,?,?)";
		int r=this.jdbcTemplate.update(query,s.getId(),s.getName(),s.getCity());
		return r;
	}
	
	@Override
	public int change(student s1) {
		// Update query
		String query="update stud set name=?,city=? where id=?";
	  int r=this.jdbcTemplate.update(query,s1.getName(),s1.getCity(),s1.getId());
	  return r;
	}
	
	@Override
	public int delete(int id) {
		// delete query
	    String query="delete from stud where id=?";
	    int r=this.jdbcTemplate.update(query,id);
		return r;
	}

	
	@Override
	public student getstudent(int id) {
		// select single student data
		
		String query="select * from stud where id=?";
		RowMapper<student> rowMapper=new rowmapperimpl();
		student s=this.jdbcTemplate.queryForObject(query,rowMapper,id);
		
		return s;
	}
	
	
	@Override
	public List<student> getallstudents() {
		// select multiple students data
		
		String query="select * from stud";
		RowMapper<student> rowMapper=new rowmapperimpl();
		List<student> stu=this.jdbcTemplate.query(query,new rowmapperimpl());
		
		
		return stu;
	}
	

}
