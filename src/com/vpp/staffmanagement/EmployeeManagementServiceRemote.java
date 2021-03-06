package com.vpp.staffmanagement;

import java.util.List;

import javax.ejb.Remote;

import com.vpp.staffmanagement.domain.Employee;

@Remote
public interface EmployeeManagementServiceRemote {
	
	public void registerEmployee(Employee newEmployee) throws SystemUnavailableException;
	public List<Employee> getAllEmployees();
	public List<Employee> searchBySurname(String surname);
	public void addEmployeeNote();
	public Employee getEmployeeById(int id);
}
