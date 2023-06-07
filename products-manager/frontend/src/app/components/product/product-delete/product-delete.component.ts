import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {

  public product: Product = {
    name: "",
    price: NaN
  }

  constructor(
    private productService: ProductService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id: string | null = this.route.snapshot.paramMap.get("id");
    if (id != null) {
      this.productService.readById(id).subscribe(product => {
        this.product = product;
      });
    }
  }

  public deleteProduct(): void {
    const id: string | null = this.route.snapshot.paramMap.get("id");
    if (id != null) {
      this.productService.delete(id).subscribe({
        next: product => {
          this.productService.showMessage("Produto excluido!");
          this.router.navigate(["/products"]);
        },
        error: error => {
          this.productService.showMessage("Erro: Produto não excluido!", true);
          console.error(error);
        }
      });
    }
  }

  public cancel(): void {
    this.router.navigate(["/products"]);
  }

}
