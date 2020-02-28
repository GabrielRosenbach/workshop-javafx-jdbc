package model.dao;

import java.util.List;

import model.entities.Department;

/** Interface que define os metodos que podem ser executados no banco de dados, relacionados ao Departamento */
public interface DepartmentDAO {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
