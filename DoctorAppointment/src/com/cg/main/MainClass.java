package com.cg.main;

import java.util.Scanner;

import com.cg.bean.DoctorappointmentBean;
import com.cg.exception.DABException;
import com.cg.service.AppointmentService;
import com.cg.service.IAppointmentService;

public class MainClass {
 public static void main(String[] args) {
	    boolean menuFlag=true;
	    System.out.println("1.Book doctor appointment");
		System.out.println("2.view doctor appointment");
		System.out.println("3.exit\n enter your choice");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		
		if(choice>0&&choice<3) {
		switch (choice) {
		case 1:
			System.out.println("enter name of patient");
			String name=scanner.nextLine();
			scanner.nextLine();
			System.out.println("enter phone number");
			Long number=scanner.nextLong();
			System.out.println("Enter email");
			String mail=scanner.nextLine();
			scanner.nextLine();
			System.out.println("enter age");
			int age=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter gender");
			String gender=scanner.nextLine();
			System.out.println("enter problem name");
			String problem=scanner.nextLine();
			
			DoctorappointmentBean appointment=new DoctorappointmentBean();
			appointment.getPatientName();
			appointment.getPhoneNumber();
			appointment.getEmail();
			appointment.getAge();
			appointment.getGender();
			appointment.getProblemName();
			
			IAppointmentService service= new AppointmentService();
			try {
				int appointmentId=0;
				appointmentId = service.insertappoinment(appointment);
				System.out.println(" Your Doctor Appointment has been booked,APPOINTMENT ID is:" + appointmentId);
				
			} catch (Exception e) {
				System.out.println("not inserted");
			}
			
			try {
				boolean validateDetails=service.validdetails(appointment);
			} catch (DABException e) {
				System.err.println("enter valid details");
			}
			
	
			break;

		
		default:
			System.out.println("Invalid Selection Try Again");
			System.out.println();
			menuFlag = false;
			break;
		}
		}else {
			System.err.println("Enter valid choice");
		}
		
}
	
}
