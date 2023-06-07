import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from '../product.model';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {

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

  public updateProduct(): void {
    this.productService.update(this.product).subscribe({
      next: product => {
        this.productService.showMessage("Produto editado!");
        this.router.navigate(["/products"]);
      },
      error: error => {
        this.productService.showMessage("Erro: Produto não editado!", true);
        console.error(error);
      }
    });
  }

  public cancel(): void {
    this.router.navigate(["/products"]);
  }
}
