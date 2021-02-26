package services;

import lombok.RequiredArgsConstructor;
import model.Product;
import org.springframework.stereotype.Service;
import repositories.ProductInMemoryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductInMemoryRepository productInMemoryRepository;

    public Optional<Product> findById (Long id) {

        return productInMemoryRepository.findById(id);
    }

   public Product saveOrUpdate(Product p) {

        return productInMemoryRepository.saveOrUpdate(p);
   }

   public void deleteById (Long id) {

        productInMemoryRepository.deleteById(id);
   }

}
