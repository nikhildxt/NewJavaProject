package com.coforge.GithubJavaProject.beanClass;

public class Employee {
	private int EnpId;
	private String EmpName;
	private long phone;
	private String Email;
	
	public Employee() {}
	
	
	public Employee(int enpId, String empName, long phone, String email) {
		super();
		EnpId = enpId;
		EmpName = empName;
		this.phone = phone;
		Email = email;
	}
	public int getEnpId() {
		return EnpId;
	}
	public void setEnpId(int enpId) {
		EnpId = enpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		result = prime * result + EnpId;
		result = prime * result + (int) (phone ^ (phone >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		if (EnpId != other.EnpId)
			return false;
		if (phone != other.phone)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [EnpId=" + EnpId + ", EmpName=" + EmpName + ", phone=" + phone + ", Email=" + Email + "]";
	}
	

}
