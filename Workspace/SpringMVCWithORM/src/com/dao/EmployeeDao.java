package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

//	@Autowired
//	DataSource ds;			// pull the Database connectivity using DI 
//	
//	public int storeEmployeeDetails(Employee emp) {
//		try {
//			Connection con = ds.getConnection();
////			Class.forName("");
////			Connection con = DriverManager.getConnection(null, null,null);
//			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?)");
//			pstmt.setInt(1, emp.getId());
//			pstmt.setString(2, emp.getName());
//			pstmt.setFloat(3, emp.getSalary());
//			pstmt.setString(4, emp.getDesg());
//			return pstmt.executeUpdate();
//		} catch (Exception e) {
//			System.out.println(e);
//			return 0;
//		}
//	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int storeEmployeeDetails(Employee emp) {
		try {
return jdbcTemplate.update("insert into employee values(?,?,?,?)", emp.getId(),emp.getName(),emp.getSalary(),emp.getDesg());
		}catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
}
