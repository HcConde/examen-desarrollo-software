package examen_desarrollo_software.examen_desarrollo_software.repositories;

import examen_desarrollo_software.examen_desarrollo_software.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}