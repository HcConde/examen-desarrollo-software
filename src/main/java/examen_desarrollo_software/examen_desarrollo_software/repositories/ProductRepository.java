package examen_desarrollo_software.examen_desarrollo_software.repositories;

import examen_desarrollo_software.examen_desarrollo_software.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Método para filtrar productos por ID de categoría [cite: 16]
    List<Product> findByCategoryId(Long categoryId);
}