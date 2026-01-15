import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class CatalogService {
  private http = inject(HttpClient);
  // Esta URL debe coincidir con tu Backend en Spring Boot
  private url = 'http://localhost:8080/api'; 

  getCategories(): Observable<any[]> {
    return this.http.get<any[]>(`${this.url}/categories`);
  }

  getProductsByCategory(id: number): Observable<any[]> {
    return this.http.get<any[]>(`${this.url}/products?categoryId=${id}`);
  }
}