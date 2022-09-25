package com.test.serialization.inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import com.test.serialization.simple.Employee;

public class TestInheritanceSerialization {

	private static final String filepath = "c:\\myjavaobject\\objectfile.txt";

	public static void main(String[] args) {

		SalariedEmplyee sal = new SalariedEmplyee(102, "emp102", "Emp102", "HYD", LocalDate.now(), 1001);

		TestInheritanceSerialization serial = new TestInheritanceSerialization();
		serial.WriteObjectToFile(sal);

		serial.getObjectToFile();

	}

	public void WriteObjectToFile(Object serObj) {

		try {

			File file = new File(filepath);
			 if(!new File("C:\\myjavaobject").exists())
             {
          	  file.mkdirs(); 
             }
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getObjectToFile() {

		try {

			FileInputStream fileInput = new FileInputStream(filepath);
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Employee e = (Employee) objectInput.readObject();
			System.out.println("Id: " + e.getId());
			System.out.println("EmpId: " + e.getEmpId());
			System.out.println("Emp Name: " + e.getName());
			System.out.println("Emp Location :" + e.getLocation());
			System.out.println("Emp Joining date: " + e.getJoinDate());
			objectInput.close();
			System.out.println("The Object  was succesfully read from file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
