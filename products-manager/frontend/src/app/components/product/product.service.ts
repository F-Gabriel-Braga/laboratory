import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Observable, EMPTY } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { Product } from './product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseURL = "http://localhost:3001/products";

  constructor(
    private snackBar: MatSnackBar,
    private http: HttpClient
  ) { }

  public showMessage(msg: string, isError: boolean = false): void {
    this.snackBar.open(msg, 'Fechar', {
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top",
      panelClass: isError ? ['msg-error'] : ['msg-success']
    });
  }

  public create(product: Product): Observable<Product> {
    return this.http.post<Product>(this.baseURL, product).pipe(
      map(obj => obj),
      catchError(error => this.errorHandler(error))
    );
  }

  public read(): Observable<Product[]> {
    return this.http.get<Product[]>(this.baseURL).pipe(
      map(obj => obj),
      catchError(error => this.errorHandler(error))
    );
  }

  public readById(id: string): Observable<Product> {
    const url = `${this.baseURL}/${id}`;
    return this.http.get<Product>(url).pipe(
      map(obj => obj),
      catchError(error => this.errorHandler(error))
    );
  }

  public update(product: Product): Observable<Product> {
    const url = `${this.baseURL}/${product.id}`;
    return this.http.put<Product>(url, product).pipe(
      map(obj => obj),
      catchError(error => this.errorHandler(error))
    );
  }

  public delete(id: string): Observable<Product> {
    const url = `${this.baseURL}/${id}`;
    return this.http.delete<Product>(url).pipe(
      map(obj => obj),
      catchError(error => this.errorHandler(error))
    );
  }

  private errorHandler(error: any): Observable<any> {
    console.error(error);
    this.showMessage("Ocorreu um erro!", true);
    return EMPTY;
  }
}
