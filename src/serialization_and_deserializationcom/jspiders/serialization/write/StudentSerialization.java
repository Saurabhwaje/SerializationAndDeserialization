package serialization_and_deserializationcom.jspiders.serialization.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Student;

public class StudentSerialization {
	public static void main(String[] args) {
		try {
			File file = new File("Student.txt");
			file.createNewFile();

			// Writing data to a File.
			FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");

			// Initializing values.
			Student student = new Student();
			student.setId(1);
			student.setName("Saurabh");
			student.setEmail("saurabhwaje4770@gmai@.com");
			student.setAddress("fsnkjvbskjbvkj  svsvbbibil");

			// Writing Object fileOutputStream
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
			System.out.println("Written Successfully....");
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
