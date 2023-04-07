package application;

import model.entities.Departament;
import model.entities.Seller;

import java.util.Date;

public class Program{
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Departament obj = new Departament(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com.br", new Date(),3000.0, obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}