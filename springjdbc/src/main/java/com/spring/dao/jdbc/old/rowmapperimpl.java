package com.spring.dao.jdbc.old;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.dao.entity.student;

public class rowmapperimpl implements RowMapper<student> {

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student st=new student();
		st.setId(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setCity(rs.getString(3));
		return st;
	}

}
