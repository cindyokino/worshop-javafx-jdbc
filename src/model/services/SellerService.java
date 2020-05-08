package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao(); //injeta a dependencia usando o padrao Factory
		
	public List<Seller> findAll() { //funcao ou método - findAll
		return dao.findAll(); //vai buscar os sellers no banco de dados
	}
	
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove (Seller obj) {
		dao.deleteById(obj.getId());
	}
	
}
