package examen_desarrollo_software.examen_desarrollo_software.repositories;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Método para filtrar por ID de categoría [cite: 16]
    List<Product> findByCategoryId(Long categoryId);
}