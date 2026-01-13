package examen_desarrollo_software.examen_desarrollo_software.entities;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore // Evita ciclos infinitos al convertir a JSON
    private List<Product> products;
    // Agrega Getters y Setters
}