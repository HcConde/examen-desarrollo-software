package examen_desarrollo_software.examen_desarrollo_software.services;

import examen_desarrollo_software.examen_desarrollo_software.entities.*;
import examen_desarrollo_software.examen_desarrollo_software.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CatalogService {
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private ProductRepository productRepo;

    public List<Category> listarCategorias() { return categoryRepo.findAll(); }
    public List<Product> listarPorCategoria(Long id) { return productRepo.findByCategoryId(id); }
}