package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program{
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" === TEST 1: seller FindById ==== ");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}