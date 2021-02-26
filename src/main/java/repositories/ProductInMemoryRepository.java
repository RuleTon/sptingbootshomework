package repositories;

import model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class ProductInMemoryRepository {
    private List<Product> products;

    @PostConstruct
    public void init(){

        products = new ArrayList<>(Arrays.asList(
        new Product(1L,"Egg",40),
        new Product(2L,"Milk",70),
        new Product(3L,"Apple",50),
        new Product(4L,"Potato",100)
        ));

    }

    public Product saveOrUpdate(Product p) {
        if (p.getId() != null) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(p.getId())) {
                    products.set(i, p);
                    return p;
                }
            }
        }


        Long newId = products.stream().mapToLong(Product::getId).max().orElseGet(() -> 0L) + 1L;
        p.setId(newId);
        products.add(p);
        return p;
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Optional<Product> findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void deleteById (Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }


}
