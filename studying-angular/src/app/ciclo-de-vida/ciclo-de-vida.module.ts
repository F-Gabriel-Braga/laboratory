import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CicloDeVidaComponent } from './ciclo-de-vida/ciclo-de-vida.component';
import { AuxiliarComponent } from './auxiliar/auxiliar.component';
import { TituloComponent } from './titulo/titulo.component';


@NgModule({
  declarations: [
    CicloDeVidaComponent,
    AuxiliarComponent,
    TituloComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    CicloDeVidaComponent,
    AuxiliarComponent,
    TituloComponent
  ]
})
export class CicloDeVidaModule { }