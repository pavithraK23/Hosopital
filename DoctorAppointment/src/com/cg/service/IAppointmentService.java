package com.cg.service;
import com.cg.bean.DoctorappointmentBean;
import com.cg.exception.DABException;

public interface IAppointmentService {

	int insertappoinment(DoctorappointmentBean appointment) throws DABException;

	boolean validdetails(DoctorappointmentBean appointment) throws DABException;

	
	

}
