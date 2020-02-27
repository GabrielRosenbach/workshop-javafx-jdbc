package model.services;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();
	
	public List<Department> findAll() {
			
		return departmentDAO.findAll();
	}
}
