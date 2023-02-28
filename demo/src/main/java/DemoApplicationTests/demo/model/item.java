package DemoApplicationTests.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "name")
    String name;
    @Column (name = "price")
    Double price;
    @Column(name = "quantity")
    Integer quantity;
    double salary;
}
