package ie.atu.week6cicd;

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
        public List<Product> newProduct(@RequestBody Product product)
        {
            //myList = myProduct.addProduct(product);
            return myProduct.addProduct(product);
        }
    }
