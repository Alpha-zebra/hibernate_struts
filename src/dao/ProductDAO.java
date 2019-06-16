package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void add(Product p){
        List<Product> result=new ArrayList<>();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
    public Product get(int id){
        Product result=null;
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        result= (Product) s.get(Product.class,id);
        s.close();
        sf.close();
        return result;
    }

    public void delete(int id){
        List<Product> result=new ArrayList<>();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        Product p= (Product) s.get(Product.class,id);
        s.delete(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
    }

    public void update(Product p){
        List<Product> result=new ArrayList<>();
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        s.beginTransaction();
        s.update(p);
        s.getTransaction().commit();
        s.close();
        sf.close();
    }

    public List<Product> listProduct(){
        System.out.println("listProduct----------method called");
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        System.out.println("before query----------->");
        Query q=s.createQuery("from Product p");
//       可以用sql语句;
        System.out.println("after query----------->");
        List<Product> result=q.list();
        System.out.println("===================================");
        result.forEach(product -> {
            System.out.println(product);

        });
        System.out.println("===================================");
        s.close();
        sf.close();
        return result;
//        Session_dao dao=new Session_dao();
//        List<Product> list=dao.session_dao();
//        return list;
    }
}
