package examen_desarrollo_software.examen_desarrollo_software.entities;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id") // Relación Foreign Key
    private Category category;
    // Agrega Getters y Setters
}