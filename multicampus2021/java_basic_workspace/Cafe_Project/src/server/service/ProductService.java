package server.service;

import java.util.ArrayList;

import common.entity.ProductDTO;
import common.util.CafeException;
import server.dao.ProductDAO;

public class ProductService {
	
	ProductDAO mdao;
	
	public ProductService() throws CafeException {
		mdao=new ProductDAO();
	}

	public void insertProduct(ProductDTO m) throws CafeException {
		mdao.insertProduct(m);
		
	}

	public ArrayList<ProductDTO> selectProduct() throws CafeException {
		return mdao.selectProduct();		
	}

}