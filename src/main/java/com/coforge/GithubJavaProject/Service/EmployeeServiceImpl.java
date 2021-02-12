package com.coforge.GithubJavaProject.Service;

import com.coforge.GithubJavaProject.DaoClass.EmployeeDaoImpl;


public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDaoImpl ed =null;
	public EmployeeServiceImpl() {
		ed =new EmployeeDaoImpl();
		
	}

	public void AddEmp() {
		ed.AddEmp();
				
	}

	public void Display() {
		ed.Display();
		
	}

}
