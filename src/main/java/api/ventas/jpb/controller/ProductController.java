package api.ventas.jpb.controller;

import api.ventas.jpb.bean.Product;
import api.ventas.jpb.repository.ProductRepository;
import api.ventas.jpb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/productlist")
    public Iterable<Product> listall(){
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product getbyid(@PathVariable Integer id){
        return productRepository.findById(id).orElse(null);
    }

    @PostMapping("/productnew")
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @PutMapping("/product/{id}")
    public Product update(@RequestBody Product product, @PathVariable Integer id){

       Product productcurrent = productRepository.findById(id).orElse(null);
       productcurrent.setNameproduct(product.getNameproduct());
       productcurrent.setTypeproduct(product.getTypeproduct());
       productcurrent.setStatus(product.getStatus());

        return productRepository.save(productcurrent);
    }

    @DeleteMapping("/product/{id}")
    public  void delete(@PathVariable Integer id){
        productRepository.deleteById(id);
    }

}
