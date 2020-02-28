package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

/** Interface que define os metodos que podem ser executados no banco de dados, relacionados ao Vendedor */
public interface SellerDAO {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
