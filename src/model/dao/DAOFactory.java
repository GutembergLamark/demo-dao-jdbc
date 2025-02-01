package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {
	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC();
	}
	
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDaoJDBC();
	}
}
