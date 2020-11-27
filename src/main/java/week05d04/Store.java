package week05d04;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }


}
