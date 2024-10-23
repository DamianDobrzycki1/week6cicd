package ie.atu.week6cicd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();

    public List<Product> getAllProduct()
    {
        return myList;
    }
    public List<Product> addProduct(Product product)
    {
        myList.add(product);
        return myList;
    }
    public List<Product> editProducts(int id, Product product)
    {
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i).getId() == id)
            {
                myList.set(i, product);
            }
        }
        return myList;
    }
    public List<Product> deleteProducts(int id)
    {
        for(int i = 0; i < myList.size(); i++)
        {
            if(myList.get(i).getId() == id)
            {
                myList.remove(i);
            }
        }
        return myList;
    }
}
