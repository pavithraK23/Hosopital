package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.cg.bean.DoctorappointmentBean;
import com.cg.dao.DoctorDao;
import com.cg.dao.DoctorDaoImpl;
import com.cg.exception.DABException;

public class AppointmentService implements IAppointmentService {
	
    DoctorDao doctordao=new DoctorDaoImpl();
	@Override
	public int insertappoinment(DoctorappointmentBean appointment) throws DABException {
		
		return doctordao.insertappointment(appointment);
	}
	@Override
	public boolean validdetails(DoctorappointmentBean appointment) throws DABException {
		List<String> list=new ArrayList<>();
		boolean resultFlag=false;
	
		if(!checkPhoneNumber(appointment.getPhoneNumber()))
		{
			
			list.add("Phone number should be of 10 digits only and should start with 6|7|8|9");
		}
        if(!checkMailId(appointment.getEmail())) {
			
			list.add("Mailid should contain @ and start with only characters");
		}
//		if(!checkProblemName(appointment.getProblemName())) {
//			list.add("Problem name should be present in list");
//		}
		if(!checkId(appointment.getAppointmentId())) {
				
				list.add("Enter valid appointment number of 4 digits");
				
			}	
		
		if(!list.isEmpty()) {
			
			
			System.out.println(list+"");
		}else
		{
			resultFlag=true;
		}
		
		return resultFlag;
		
	}
	
	public boolean checkId(Integer appointmentId) {
        String regEx="[0-9]{4}$";
		
		return Pattern.matches(regEx, appointmentId.toString());
		
	}
//	public boolean checkProblemName(String problemName) {
//		boolean disapproved=false;
//		boolean appointmentstatus=disapproved;
//		
//		if(problemName.equals(Heart.table){
//			return (appointmentstatus);
//		}
//	}
	public boolean checkMailId(String email) {
		String regEx="[a-zA-Z]{1}[a-zA-Z0-9._]*@[A-Za-z]*\\.[a-zA-Z]*";
		return Pattern.matches(regEx, email);
	}
	public boolean checkPhoneNumber(Long phoneNumber) {
		String regEx="[6|7|8|9]{1}[0-9]{9}$";
		return Pattern.matches(regEx, phoneNumber.toString());
	}

	

}
