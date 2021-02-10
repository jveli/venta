package api.ventas.jpb.service;

import api.ventas.jpb.bean.Product;

import java.util.List;

public interface ProductService {

    public Iterable<Product> getAllProducts();

    public Product getProductById(int id);

    public Product save(Product product);

    public void delete (Integer id);

}
