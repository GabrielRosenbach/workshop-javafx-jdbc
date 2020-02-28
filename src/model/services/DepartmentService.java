package model.services;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

/** Classe serviço de Departamento */
public class DepartmentService {
	
	private DepartmentDAO departmentDAO = DAOFactory.createDepartmentDAO();
	
	public List<Department> findAll() {
			
		return departmentDAO.findAll();
	}
	
	public void saveOrUpdate(Department department) {
		
		if (department.getId() == null) {
			
			departmentDAO.insert(department);
		} else {
			
			departmentDAO.update(department);
		}
	}
	
	public void remove(Department department) {
		
		departmentDAO.deleteById(department.getId());
	}
}
