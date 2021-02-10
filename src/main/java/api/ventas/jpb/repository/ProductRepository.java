package api.ventas.jpb.repository;

import api.ventas.jpb.bean.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
