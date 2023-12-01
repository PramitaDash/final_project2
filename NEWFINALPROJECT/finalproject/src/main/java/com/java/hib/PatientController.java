package com.java.hib;

import java.util.Map;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class PatientController {

	private PatientenrollmentDAOImpl daoImpll;
	private Patientenrollment patientenrollment;

	public PatientenrollmentDAOImpl getDaoImpll() {
		return daoImpll;
	}

	public void setDaoImpll(PatientenrollmentDAOImpl daoImpll) {
		this.daoImpll = daoImpll;
	}

	public Patientenrollment getPatientenrollment() {
		return patientenrollment;
	}

	public void setPatientenrollment(Patientenrollment patientenrollment) {
		this.patientenrollment = patientenrollment;
	}

	public String updatePatientValid(Patientenrollment patient) {
		System.out.println(patient);
//		System.out.println(daoImpl);
		System.out.println("addPatientValid is Hittingggggggggg");
		System.out.println(updateValid(patient));
		if (updateValid(patient)) {
			return daoImpll.updatePatientenrollment(patient);
		}
		return "";
 
	}
	public boolean updateValid(Patientenrollment patient) {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		FacesContext context = FacesContext.getCurrentInstance();
		String firstName = "^[A-Za-z\\s]+$";
		String lastName = "^[A-Za-z\\s]+$";
		String userName = "^[^\\s]{8,10}$";
		String phoneno = "^(\\+91|91|0)?[6789]\\d{9}$";
		String email = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String password = "^(?=.*[A-Z])(?=.*[a-z0-9])(?=.*[^a-zA-Z0-9]).{8,18}$";
//		String dateFormatRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

//FIRSTNAME
		boolean flag = true;
		System.out.println("FirstName Length is " + patient.getFirstname().length());
		if (patient.getFirstname().length() <= 5) {
			context.addMessage("form:firstName", new FacesMessage("FirstName Cannot be Empty..."));
			System.out.println("FirstName Null Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError1" ,"Invalid firstname.FirstName must be greater	 then 5...");
			flag = false;
		}

		if (!Pattern.matches(firstName, patient.getFirstname())) {
			context.addMessage("form:firstName", new FacesMessage("Invalid FirstName. Only letters are allowed."));
			System.out.println("FirstName Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError" ,"Invalid firstname.Only letters");
			flag = false;
		}

//PASSWORD
//		if (patient.getPassword().length() <= 0) {
//		    context.addMessage("form:Password", new FacesMessage("Password Cannot be Empty..."));
//		    System.out.println("Password Null Failed...");
//		    flag = false;
//		} else if (!Pattern.matches(password, patient.getPassword())) {
//		    context.addMessage("form:password", new FacesMessage("Invalid Password format.Hint: @Abcde1234"));
//		    System.out.println("Password failed.");
//		    flag = false;
//		}

//USERNAME		
		if (patient.getUsername().length() <= 8) {
			context.addMessage("form:userName", new FacesMessage("Username Contains min 8 characters."));
			System.out.println("UserName Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError2" ,"Invalid userName.Username Contains min 8 characters.");
			flag = false;
		}
//LASTNAME
		if (patient.getLastname().length()<=2) {
			context.addMessage("form:lastName", new FacesMessage("LastName Cannot Be Empty."));
			System.out.println("LastName Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError3" ,"Lastname cannot be less than 5 char.");
			flag = false;
		}
		if (!Pattern.matches(lastName, patient.getLastname())) {
			context.addMessage("form:lastName", new FacesMessage("Invalid LastName. Only letters are allowed."));
			System.out.println("LastName Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError4" ,"Invalid LastName. Only letters are allowed.");
			flag = false;
		}

//PHONENUMBER
		if (patient.getPhoneno().length() <= 0) {
			context.addMessage("form:phoneno", new FacesMessage("Enter Your Phone Number."));
			System.out.println("PhoneNo Failed...");
		  flag= false;
		}
 
		if (!Pattern.matches(phoneno, patient.getPhoneno())) {
			context.addMessage("form:phoneno", new FacesMessage("Invalid Phone Number."));
			System.out.println("PhoneNo Failed...");
		  flag= false;
		}
//GMAIL
		if (patient.getEmail().length() <= 8) {
			context.addMessage("form:email", new FacesMessage("Email Cannot Be Empty"));
			System.out.println("Email Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError4" ,"Invalid email.Email Cannot Be Empty");
			flag = false;
		}
		if (!Pattern.matches(email, patient.getEmail())) {
			context.addMessage("form:email", new FacesMessage("Invalid Email."));
			System.out.println("Email Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError5" ,"Invalid Email..");
			flag = false;
		}
//ADDRESS
		if (patient.getAddress().length() <= 0) {
			context.addMessage("form:address", new FacesMessage("Please Enter Your Address."));
			System.out.println("Enter Your Address");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError6" ,"Invalid Address.Please Enter Your Address.");
			flag = false;
		}
//MEDICALHISTORY
		if (patient.getMedhistory().length() <= 0) {
			context.addMessage("form:medHistory", new FacesMessage("Please Enter Your Medical History."));
			System.out.println("Enter Your MEdHistory");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError7" ,"Invalid MEdHistory.Please Enter Your Medical History.");
			flag = false;
		}
//DOB
		if (patient.getDob() == null) {
			context.addMessage("form:dob", new FacesMessage("DOB cannot be empty."));
			System.out.println("Enter Your DOB");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError8" ,"Invalid DOB.DOB cannot be empty.");
			flag = false;
		}

//GENDER
		if (patient.getGender() == null || patient.getGender().isEmpty()) {
			context.addMessage("form:gender", new FacesMessage("Select Gender."));
			System.out.println("Select Gender Failed...");
			Map<String, Object> sessionMap2 = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap2.put("FirstError9" ,"Invalid Gender.Select Gender Failed...");
			flag = false;
		}

		

		return flag;
	}

}
