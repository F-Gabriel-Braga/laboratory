import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {


  public product: Product = {
    name: "",
    price: NaN
  }

  constructor(
    private productService: ProductService,
    private router: Router
  ) { }

  ngOnInit(): void {
    
  }

  public createProduct(): void {
    this.productService.create(this.product).subscribe({
      next: product => {
        this.productService.showMessage("Produto cadastrado!");
        this.router.navigate(["/products"])      
      },
      error: error => {
        this.productService.showMessage("Erro: Produto não cadastrado!", true);
        console.error(error);
      }
    });
  }

  public cancel(): void {
    this.router.navigate(["/products"]);
  }
}
