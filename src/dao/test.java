package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<Product> result=new ArrayList<>();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Query q=s.createQuery("from pojo.Product p");
//       可以用sql语句;

        result=q.list();
        System.out.println("===================================");
        result.forEach(product -> {
            System.out.println(product);

        });
        s.close();
        sf.close();
        ProductDAO dao=new ProductDAO();
        List<Product> list=dao.listProduct();
        list.forEach(l->{
            System.out.println(l);
        });

    }
}
