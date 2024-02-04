package siteCafeManagement.manager.category;

public interface CategoryService {
    void addCategory(String categoryName);
    void updateCategory(String oldCategoryName, String newCategoryName);
    void deleteCategory(String categoryName);
    void printCategories();
}