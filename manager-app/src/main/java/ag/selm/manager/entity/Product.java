package ag.selm.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

    private Integer id;

    private String title;

    private String details;

    public Product(Integer id, String title, String details) {
        this.id = id;
        this.title = title;
        this.details = details;
    }
}
