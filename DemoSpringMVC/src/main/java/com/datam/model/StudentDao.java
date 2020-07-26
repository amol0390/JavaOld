package com.datam.model;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List; 

public class StudentDao {  
private JdbcTemplate jdbcTemplate;  
  
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
  
public int saveStudent(Student e){  
    String query="insert into Student values('" + e.getRollno() + "','Python','"+e.getName()+"','Delhi')";  
    return jdbcTemplate.update(query);  
}  
public int updateStudent(Student e){  
    String query="update Student set name='"+e.getName()+"' where id='"+e.getRollno()+"' ";  
    return jdbcTemplate.update(query);  
}  
public int deleteStudent(Student e){  
    String query="delete from Student where id='"+e.getRollno()+"' ";  
    return jdbcTemplate.update(query);  
}  
  

}  
