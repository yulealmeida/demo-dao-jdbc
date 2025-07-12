package application;

import model.dao.Daofactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);


        SellerDao sellerDao = Daofactory.createdSellerDao();
        
        System.out.println("=== TEST 1: Seller findById ===");
        Seller seller = sellerDao.findById(1);
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
/*
        System.out.println("\n=== TEST 4: insert implementation===");
        Seller newSeller = new Seller("Greg Altman",11,"greg@bol.com",4000.0,new Date(),department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());
*/


        System.out.println("\n=== TEST 5: update implementation===");
        seller = sellerDao.findById(1);
        seller.setName("Bob Waine");
        seller.setEmail("bob@hotmail.com");
        seller.setBaseSalary(2091.0);
        sellerDao.update(seller);
        System.out.println("Update Completed");

        System.out.println("\n=== TEST 6: Delete implementation===");
        System.out.println("Enter Id for delete teste: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");


        sc.close();





    }


}
