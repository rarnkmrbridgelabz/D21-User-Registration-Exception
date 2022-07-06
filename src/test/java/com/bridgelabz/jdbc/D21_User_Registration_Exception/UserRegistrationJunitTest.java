package com.bridgelabz.jdbc.D21_User_Registration_Exception;

import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationJunitTest {

	@Test
	public void givenFirstName_WhenCorrect_ShouldReturnTrue() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertTrue(userRegistrationJunit.validateName("Hemnath"));
	}

	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertFalse(userRegistrationJunit.validateName("hemnath"));
	}

	@Test
	public void givenMobileNumber_WhenCorrect_ShouldReturnTrue() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertTrue(userRegistrationJunit.validateMobileNumber("99 8877445566"));
	}

	@Test
	public void givenMobileNumber_WhenLessNumber_ShouldReturnFalse() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertFalse(userRegistrationJunit.validateMobileNumber("9988774455669"));
	}

	@Test
	public void givenEmail_WhenCorrect_ShouldReturnTrue() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertTrue(userRegistrationJunit.validateEmail("hemnath@gmail.com"));
	}

	@Test
	public void givenEmail_WhenNotCorrect_ShouldReturnFalse() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertFalse(userRegistrationJunit.validateEmail("hem.nath@gmail.com"));
	}

	@Test
	public void givenPassword_WhenCorrect_ShouldReturnTrue() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertTrue(userRegistrationJunit.validatePassword("H!Mnpintd2r!"));
	}

	@Test
	public void givenPassword_WhenInCorrectWithRegexCondition_ShouldReturnFalse() {
		UserRegistrationJunit userRegistrationJunit = new UserRegistrationJunit();
		Assert.assertFalse(userRegistrationJunit.validatePassword("H!Mnpin!"));
	}
}
