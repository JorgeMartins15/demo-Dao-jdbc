package application;



import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(100, "Jorge");
		
		Seller seller = new Seller(10, "Jorge", "martins@gmail.com", new Date(), 5000.00, obj);

		System.out.println(seller);

	}

}
