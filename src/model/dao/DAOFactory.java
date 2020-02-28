package model.dao;

/** Classe factory que gera os DAO's */
import db.DB;
import model.dao.impl.DepartmentDAOImpl;
import model.dao.impl.SellerDAOImpl;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDAOImpl(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDAOImpl(DB.getConnection());
	}
}
