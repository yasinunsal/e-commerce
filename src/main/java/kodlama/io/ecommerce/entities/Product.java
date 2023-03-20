package kodlama.io.ecommerce.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private String description;
}
