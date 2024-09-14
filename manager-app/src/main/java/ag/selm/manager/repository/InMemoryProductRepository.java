package ag.selm.manager.repository;

import ag.selm.manager.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final List<Product> products = Collections.synchronizedList(new LinkedList<>());

    public InMemoryProductRepository() {
        IntStream.range(1, 4)
                .forEach(i -> this.products.add(new Product(i, "Товар", "Описание")));
    }


    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.products);
    }
}
