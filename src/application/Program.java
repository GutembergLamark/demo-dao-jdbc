package application;

import java.util.Date;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = DAOFactory.createSellerDAO();
		
		System.out.println("==== TEST 1: seller findByID ====\n");
		Seller seller = sellerDAO.findById(3);
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment ====\n");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n==== TEST 3: seller findAll ====\n");
		list = sellerDAO.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n==== TEST 4: seller insert ====\n");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDAO.insert(newSeller);
		System.out.println("Inserted! New Id - " + newSeller.getId());
	}

}
