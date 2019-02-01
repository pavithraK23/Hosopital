package com.cg.dao;

import com.cg.bean.DoctorappointmentBean;
import com.cg.exception.DABException;

public interface DoctorDao {

	int insertappointment(DoctorappointmentBean appointment)throws DABException;

}
