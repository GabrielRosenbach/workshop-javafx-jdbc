package model.services;

import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Seller;

/** Classe serviço de Departamento */
public class SellerService {
	
	private SellerDAO sellerDAO = DAOFactory.createSellerDAO();
	
	public List<Seller> findAll() {
			
		return sellerDAO.findAll();
	}
	
	public void saveOrUpdate(Seller seller) {
		
		if (seller.getId() == null) {
			
			sellerDAO.insert(seller);
		} else {
			
			sellerDAO.update(seller);
		}
	}
	
	public void remove(Seller seller) {
		
		sellerDAO.deleteById(seller.getId());
	}
}
