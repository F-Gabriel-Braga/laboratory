import { Component } from '@angular/core';

@Component({
  selector: 'app-diretivas',
  templateUrl: './diretivas.component.html',
  styleUrls: ['./diretivas.component.css']
})
export class DiretivasComponent {

  constructor() { }

  // NgIf
  public visivel: boolean = true;
  public alterarVisualizacao(): void {
    this.visivel = !this.visivel;
  }
  public parado: boolean = true;
  public alterarSapo() {
    this.parado = !this.parado;
  }

  // NgFor
  public listaCompras: string[] = ["Leite", "Café", "Arroz", "Carne"];
  public itemDigitado: string = "";
  public adicionarItem(): void {
    this.listaCompras.push(this.itemDigitado);
    this.itemDigitado = "";
  }

  // NgSwitch
  public mes!: number;
  public converterMes(value: string) {
    this.mes = parseInt(value);
  }

  // NgClass
  public habilitado: boolean = true;
  public habilitarDesabilitar(): void {
    this.habilitado = !this.habilitado;
  }

  // NgStyle
  public size: string = "300px";
  public alterarTamanho(value: string): void {
    this.size = value+"px";
  }

  // NgModel
  public texto: string = "";

  // Highlight
  public color: string = "yellow";
  public aplicarCor(color: string): void {
    this.color = color;
  }
}
