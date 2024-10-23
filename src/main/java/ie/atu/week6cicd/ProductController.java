package ie.atu.week6cicd;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    @GetMapping("/getProduct")
    public List<Product> getAllProducts() {
        return myProduct.getAllProduct();
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@RequestBody @Valid Product product) {
        //myList = myProduct.addProduct(product);
        return myProduct.addProduct(product);
    }
    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deleteProducts(@PathVariable int id)
    {
        return myProduct.deleteProducts(id);
    }
    @PutMapping("/editProduct/{id}")
    public List<Product> editProducts(@Valid @PathVariable int id, @Valid @RequestBody Product product)
    {
        return myProduct.editProducts(id, product);
    }
}
