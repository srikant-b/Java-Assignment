package com.nissan.app.util;

import com.nissan.app.exception.EmployeeException;
import com.nissan.app.pojo.Employee;

public class EmployeeAppUtil {

	public static void addEmployee(String empName, String orgName, byte empAge)
			throws EmployeeException {
		Employee newEmp = new Employee(empName, orgName, validateAge(empAge));
		System.out.println(newEmp.toString());
	}

	public static byte validateAge(byte age) throws EmployeeException {
		if (age < 18 || age > 60) {
			throw new EmployeeException(
					"Employee age can't be less than 18 or greater than 60");
		}
		return age;
	}
}
