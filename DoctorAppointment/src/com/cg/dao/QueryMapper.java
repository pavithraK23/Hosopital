package com.cg.dao;

public interface QueryMapper {

	public static final String insertappointment = "INSERT INTO doctor_appointment VALUES(seq_aapointment_id.nextval,?,?,?,?,?,?)";
	
	public static final String currval = "SELECT seq_aapointment_id.currval FROM dual";

}
