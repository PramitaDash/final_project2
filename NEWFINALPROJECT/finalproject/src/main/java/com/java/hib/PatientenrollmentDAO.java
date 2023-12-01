package com.java.hib;

import java.util.List;

public interface PatientenrollmentDAO {
	
	List<Patientenrollment> showPatientenrollment();
	String searchPatientrenrollment(String uhid);
	String updatePatientenrollment(Patientenrollment PatientenrollmentUpdate);
	


}
