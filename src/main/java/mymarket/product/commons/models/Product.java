package mymarket.product.commons.models;

import lombok.*;
import mymarket.product.commons.models.enums.Clasifications;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "image", nullable = false)
    private String image;
    @Column(name = "clasification")
    @Enumerated(EnumType.STRING)
    private Clasifications clasification;
    @Column(name = "description")
    private String description;
}
