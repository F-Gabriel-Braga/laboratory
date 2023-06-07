import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ModuloComponent } from './modulo/modulo.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';


@NgModule({
  declarations: [
    ModuloComponent,
    LandingPageComponent
  ],
  imports: [
    CommonModule,
    MatToolbarModule,
    MatIconModule
  ],
  exports: [
    ModuloComponent,
    LandingPageComponent
  ]
})
export class ModuloTesteModule { }
