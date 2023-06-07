import { Component, EventEmitter, Input, Output, ViewChild } from '@angular/core';

@Component({
  selector: 'app-interno',
  templateUrl: './interno.component.html',
  styleUrls: ['./interno.component.css']
})
export class InternoComponent {

  constructor() { }

  //@Input()
  //public nomeInterno: string = "";

  //nomeInterno: string = "";

  //public nomes: string[] = ["Vanessa Almeida", "João Victor", "Daniel"];

  // EventEmitter é a classe evento que vai gerar um evento e emissão / envio.
  //@Output()
  //public enviaNome: EventEmitter<string> = new EventEmitter();

  /*public enviarNome(position: number): void {
    //this.enviaNome.emit(this.nomes[position]); // Envia os dados
    this.enviaNome.emit(this.nomeInterno);
  }*
  
  //*public enviarNome(): void {
    this.enviaNome.emit(this.nomeInterno);
  }*/

  // Exercicio
  @Input()
  public pessoa: {nome: string, idade: number} | null = null;

  // ViewChild
  public propriedade: string = "Valor do componente interno!";
}
