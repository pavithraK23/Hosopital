package com.cg.bean;

import java.time.LocalDate;

public class DoctorappointmentBean {

	private Integer appointmentId;
	private String patientName;
	private Long phoneNumber;
	private LocalDate dateOfApppointment;
	private String email;
	private Integer age;
	private String gender;
	private String problemName;
	private String doctorName;
	private String appointmentStatus;
	
	public DoctorappointmentBean() {
		// TODO Auto-generated constructor stub
	}

	public DoctorappointmentBean(Integer appointmentId, String patientName, Long phoneNumber,
			LocalDate dateOfApppointment, String email, Integer age, String gender, String problemName,
			String doctorName, String appointmentStatus) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.dateOfApppointment = dateOfApppointment;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.problemName = problemName;
		this.doctorName = doctorName;
		this.appointmentStatus = appointmentStatus;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfApppointment() {
		return dateOfApppointment;
	}

	public void setDateOfApppointment(LocalDate dateOfApppointment) {
		this.dateOfApppointment = dateOfApppointment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProblemName() {
		return problemName;
	}

	public void setProblemName(String problemName) {
		this.problemName = problemName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	
	
}
