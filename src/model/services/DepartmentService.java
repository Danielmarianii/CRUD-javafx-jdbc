package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	
	public List<Department>  findall(){
		List<Department> list =new ArrayList<>();
		list.add(new Department(1,"Books"));
		list.add(new Department(2, "Cars"));
		list.add(new Department(3, "Tables"));
		list.add(new Department(4,"Computers"));
		list.add(new Department(5, "Electronics"));
		list.add(new Department(6, "Phones"));
		return list;
	}
}
