package action;

import dao.CategoryDAO;
import dao.ProductDAO;
import pojo.Category;

import pojo.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAction{
    ProductDAO pdao=new ProductDAO();
    CategoryDAO cdao=new CategoryDAO();
    Product product;
    List<Product> products;
    List<Category> categorys;
    Category category;

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public String add(){
        pdao.add(product);
        return "list";
    }
    public String edit(){
        categorys=cdao.listCategory();
        product=pdao.get(product.getId());
        return "edit";
    }
    public String delete(){
        pdao.delete(product.getId());
        return "list";

    }
    public String update(){
        pdao.update(product);
        return "list";
    }
    public String list(){
        categorys = cdao.listCategory();
        if(null!=category){
            category = cdao.get(category.getId());
            products = new ArrayList(  category.getProducts());
            return "listJsp";
        }
        else{
            products = pdao.listProduct();
            return "listJsp";
        }
    }
    public String home(){
        System.out.println("test------------>ProductAction>home>called");
        return "home";
    }
}