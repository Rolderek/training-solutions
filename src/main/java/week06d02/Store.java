package week06d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Store {

    List<Product> products = new ArrayList<>();

    public int getProductByCategoryByName(List<Product> products, Category category) {
        isNull(products);
        int i = 0;
        for (Product product: products) {
            if (product.getCategory() == category) {
                i++;
            }
        }
        return i;
    }

    public void isNull(List<Product> products) {
        if (products == null || products.size() == 0) {
            throw new NullPointerException("A terméklista nem lehet üres!");
        }
    }

    public List<CategorySum> getProductsByCategory(List<Product> products) {
        List<CategorySum> categorySums = new ArrayList<>();
        for (Category category : Category.values()) {
            int i = getProductByCategoryByName(products, category);
            categorySums.add(new CategorySum(i, category));
        }
        return categorySums;
    }
}
