import { Component, OnInit, inject } from '@angular/core';
import { CatalogService } from './services/catalog.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.html'
})
export class App implements OnInit {
  private catalogService = inject(CatalogService);
  categories: any[] = [];
  products: any[] = [];

  ngOnInit() {
    // Carga inicial de categorías
    this.catalogService.getCategories().subscribe(res => this.categories = res);
  }

  // Evento (change) solicitado para el filtrado dinámico
  onCategoryChange(event: any) {
    const id = event.target.value;
    if (id) {
      this.catalogService.getProductsByCategory(id).subscribe(res => this.products = res);
    } else {
      this.products = [];
    }
  }
}