package com.bridgelabz.jdbc.D21_User_Registration_Exception;

public class UserRegistrationJunit {

	public boolean validateName(String name) {
		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
		return true;
	}

	public boolean validateEmail(String email) {
		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return true;
	}

	public boolean validateMobileNumber(String mobileNumber) {
		String mobileNumberRegex = "^[0-9]{2}[ ]?[0-9]{10}$";
		return true;
	}

	public boolean validatePassword(String password) {
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
		return true;
	}

}