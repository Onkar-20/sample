package com.spring.dao.jdbc.old;

import java.util.List;

import com.spring.dao.entity.student;

public interface studentdao {

	public int insert(student s);
	public int change(student s1);
	public int delete(int id);
	public student getstudent(int id);
	public List<student> getallstudents();


}
