package serialization_and_deserializationcom.jspiders.serialization.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Employee;

public class EmployeeDeserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("Employee.txt");

			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Employee employee = (Employee) objectInputStream.readObject();
			System.out.println(employee);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
