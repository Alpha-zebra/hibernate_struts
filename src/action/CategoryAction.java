package action;

import dao.CategoryDAO;
import pojo.Category;


import java.util.List;

public class CategoryAction {

    CategoryDAO cdao = new CategoryDAO();
    Category category;
    List<Category> categorys;


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


    public String add() {
        cdao.add(category);
        return "list";
    }
    public String edit() {
        category =cdao.get(category.getId());
        return "edit";
    }
    public String delete() {
        cdao.delete(category.getId());
        return "list";
    }
    public String update() {
        cdao.update(category);
        return "list";
    }
    public String list() {
        categorys = cdao.listCategory();
        return "listJsp";
    }
}
