import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DiretivasComponent } from './diretivas/diretivas.component';
import { MouseHighlightDirective } from './diretivas-customizadas/mouse-highlight.directive';
import { PinkDirective } from './diretivas-customizadas/pink.directive';
import { TextBlueDirective } from './diretivas-customizadas/text-blue.directive';
import { ListaAlunosComponent } from './lista-alunos/lista-alunos.component';
import { FormsModule } from '@angular/forms';
import { TesteComponent } from './teste/teste.component';



@NgModule({
  declarations: [
    DiretivasComponent,
    MouseHighlightDirective,
    PinkDirective,
    TextBlueDirective,
    ListaAlunosComponent,
    TesteComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports: [
    DiretivasComponent,
    MouseHighlightDirective,
    PinkDirective,
    TextBlueDirective,
    ListaAlunosComponent,
    TesteComponent
  ]
})
export class DiretivasModule { }
