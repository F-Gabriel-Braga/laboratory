import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FoodsComponent } from './foods/foods.component';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    FoodsComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  exports: [
    FoodsComponent
  ]
})
export class ServicosModule { }
