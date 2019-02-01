package com.cg.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.bean.DoctorappointmentBean;
import com.cg.exception.DABException;
import com.cg.utility.JdbcUtility;

public class DoctorDaoImpl implements DoctorDao {
	PreparedStatement statement=null;
	Connection connection=null;
    boolean checkFlag=false;
	@Override
	public int insertappointment(DoctorappointmentBean appointment) throws DABException {
		ResultSet result=null;
		connection=JdbcUtility.getConnection();
		int appointmentId=0;
		
		try {
			statement=connection.prepareStatement(QueryMapper.insertappointment);
			statement.setString(2, appointment.getPatientName());
			statement.setLong(3, appointment.getPhoneNumber());
			statement.setString(5, appointment.getEmail());
			statement.setInt(6, appointment.getAge());
			statement.setString(7, appointment.getGender());
			statement.setString(8, appointment.getProblemName());
			statement.executeQuery();
			
			statement=connection.prepareStatement(QueryMapper.currval);
			result=statement.executeQuery();
			result.next();
			appointmentId=result.getInt(1);
		} catch (SQLException e) {
			System.err.println("Sql statement not executed");
			
		}
		
		return appointmentId;
	}

}
