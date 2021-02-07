package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private String companySuffix = "company.com";

	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;

	// Constructor needs firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		// Call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

	}

	// Ask for the department

	private String setDepartment() {
		System.out.println(
				"New Worker: " + firstName + " " + lastName + "\n" + "DEPARTMENT CODES\n1 for Sale \n2 for Developement "
						+ "\n3 for Accounting \n4 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		switch (depChoice) {
		case 1:
			return "sales";
		case 2:
			return "developement";
		case 3:
			return "accounting";
		default:
			return "";
		}

	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox capacity

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Set the alternate email

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Display name: " + firstName + " " + lastName + "\n" + "Company email: " + email + "\n"
				+ "Mailbox Capacity : " + mailboxCapacity + "mb";
	}

}
