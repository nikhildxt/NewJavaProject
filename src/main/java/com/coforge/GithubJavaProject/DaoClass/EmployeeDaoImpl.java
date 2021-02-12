package com.coforge.GithubJavaProject.DaoClass;

import java.util.Scanner;

import com.coforge.GithubJavaProject.beanClass.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private Employee e = null;
	Scanner sc = new Scanner(System.in);
	public EmployeeDaoImpl() {
		e =new Employee();
	}

	public void AddEmp() {
	
		e.setEnpId(sc.nextInt());
		e.setEmpName(sc.next());
		e.setPhone(sc.nextLong());
		e.setEmail(sc.next());
		
		
	}

	public void Display() {
		System.out.println(e.getEnpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getPhone());
		System.out.println(e.getEmail());
		
		
	}


	

}
