package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main (String[] args) {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller("Bob",21,"bob@gmail.com",3000.0, new Date(),obj);

        SellerDao sellerDao = Daofactory.createdSellerDao(); 

        System.out.println(seller);
        
    }
}
