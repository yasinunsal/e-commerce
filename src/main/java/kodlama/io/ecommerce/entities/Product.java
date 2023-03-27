package kodlama.io.ecommerce.entities;

import jakarta.persistence.*;
import kodlama.io.ecommerce.entities.enums.Status;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private String description;
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;
}
