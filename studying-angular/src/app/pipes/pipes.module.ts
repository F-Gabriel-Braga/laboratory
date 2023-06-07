import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PipesComponent } from './pipes/pipes.component';
import { ArraySumPipe } from './pipes-custom/array-sum.pipe';
import { CamelCasePipe } from './pipes-custom/camel-case.pipe';

@NgModule({
  declarations: [
    PipesComponent,
    ArraySumPipe,
    CamelCasePipe
  ],
  imports: [
    CommonModule
  ]
})
export class PipesModule { }
