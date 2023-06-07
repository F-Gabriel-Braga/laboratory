import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { InternoComponent } from './interno/interno.component';

@Component({
  selector: 'app-externo',
  templateUrl: './externo.component.html',
  styleUrls: ['./externo.component.css']
})
export class ExternoComponent {

  constructor() { }

  //public nomeExterno: string = "Gustavo Brandão";

  //public nomeExterno: string = "";

  /*public recebeNome(nome: string) {
    this.nomeExterno = nome;
  }*/

  // Exercicio
  public pessoa: {nome: string, idade: number} = {nome: "Gabriel", idade: 20};

  // Template Variable
  texto: string = "";
  public mostrar(texto: string): void {
    this.texto = texto;
  }

  // ViewChild / Ver Filho
  @ViewChild('interno') // passando a Template Variable do meu filho
  public interno!: InternoComponent;

  @ViewChild('campo')
  public campo!: ElementRef; // Tipo de filho de um elemento HTML
}