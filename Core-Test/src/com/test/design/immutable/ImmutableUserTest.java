package com.test.design.immutable;

public class ImmutableUserTest {

	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Jan");
		address.setHno("273");
		address.setPin(222105);
		try {
			User user = new User(1, "XYZ", "dfd@gmail.com", address);

			System.out.println("ID : " + user.getId());
			System.out.println("Name : " + user.getName());
			System.out.println("Email : " + user.getEmail());
			System.out.println("Actual User " + user.getAddress());
			Address a = user.getAddress();
			a.setCity("Noida");
			a.setHno("566");
			a.setPin(201309);

			System.out.println("Modified User  " + a);
			System.out.println("Actual User  " + user.getAddress());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
