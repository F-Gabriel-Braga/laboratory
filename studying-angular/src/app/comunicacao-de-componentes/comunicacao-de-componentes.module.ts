import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ExternoComponent } from './externo/externo.component';
import { InternoComponent } from './externo/interno/interno.component';



@NgModule({
  declarations: [
    ExternoComponent,
    InternoComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ExternoComponent,
    InternoComponent
  ]
})
export class ComunicacaoDeComponentesModule { }
