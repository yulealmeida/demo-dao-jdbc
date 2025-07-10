package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main (String[] args) {


        SellerDao sellerDao = Daofactory.createdSellerDao();
        
        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(5);

        System.out.println(seller);
        
    }
}
