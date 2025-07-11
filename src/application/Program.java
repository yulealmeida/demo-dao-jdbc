package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main (String[] args) {


        SellerDao sellerDao = Daofactory.createdSellerDao();
        
        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(5);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: Seller findByDepatment ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: Seller findAll===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 4: Seller findAll===");
        Seller newSeller = new Seller("Greg Altman",null,"greg@bol.com",4000.0,new Date(),department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: Seller findAll===");
        seller = sellerDao.findById(1);
        seller.setName("Maria Waine");
        sellerDao.update(seller);
        System.out.println("Update Completed");





    }


}
