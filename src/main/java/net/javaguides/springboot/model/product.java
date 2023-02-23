package net.javaguides.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

import javax.persistence.*;

@Entity(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "Products",
        schema = "SpringBootEmployee",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "Product_name_unq", columnNames = "Product_Name"
                )
        }
)
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Product_Name", nullable = false)
    private String productName;
    @Column(nullable = false, length = 255)
    private String Description;

    @Column(name = "ProductAvailabilityFlag")
    private boolean isProductAvailable;

}
