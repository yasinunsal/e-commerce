package kodlama.io.ecommerce.repository.concretes;

import kodlama.io.ecommerce.entities.Product;
import kodlama.io.ecommerce.repository.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    List<Product> products;

    public InMemoryProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "x drive oyuncu koltuğu ", 10, 3000, "x drive's product"));
        products.add(new Product(2, "dji drone", 10, 10000, "dji's product"));
        products.add(new Product(3, "jbl 500bt ", 5, 1000, "jbl's product"));
        products.add(new Product(4, " xiaomi smart kamera", 7, 15000, "xiaomi's product"));
        products.add(new Product(5, "tefal ultimate ütü ", 10, 5000, "tefal's product"));
    }

    @Override
    public Product add(Product product) {
        products.add(product);

        return product;
    }

    @Override
    public void delete(int id) {
        products.remove(id - 1);
    }

    @Override
    public Product update(Product product, int id) {
        return products.set(id - 1, product);
    }

    @Override
    public List<Product> getAll() {

        return products;
    }

    @Override
    public Product getById(int id) {
        return products.get(id - 1);
    }
}
