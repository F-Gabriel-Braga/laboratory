import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TemplateDrivenComponent } from './template-driven/template-driven.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DataDrivenComponent } from './data-driven/data-driven.component';



@NgModule({
  declarations: [
    TemplateDrivenComponent,
    DataDrivenComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  exports: [
    TemplateDrivenComponent
  ]
})
export class FormsModule2 { }
