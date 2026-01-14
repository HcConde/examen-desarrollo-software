package examen_desarrollo_software.examen_desarrollo_software.controllers;

import examen_desarrollo_software.examen_desarrollo_software.entities.*;
import examen_desarrollo_software.examen_desarrollo_software.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // CORS configurado
public class CatalogController {
    @Autowired
    private CatalogService catalogService;

    @GetMapping("/categories")
    public List<Category> getCategories() { return catalogService.listarCategorias(); }

    @GetMapping("/products")
    public List<Product> getProducts(@RequestParam Long categoryId) {
        return catalogService.listarPorCategoria(categoryId);
    }
}