import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {

  constructor() { }
  
  nome: string = "Aecio da Silva";
  idade: number = 27;

  desabilitado: boolean = true;
  logoJava: string = "https://www.infoescola.com/wp-content/uploads/2011/03/java.jpg";

  alertar(): void {
    alert("Warning!");
  }

  x: number = 0;
  y: number = 0;
  localizar(event: MouseEvent): void {
    this.x = event.offsetX;
    this.y = event.offsetY;
  }

  texto!: string;

  a: number = 0; // x
  b: number = 0; // y
  stylePosition: string = "left: 0; top: 0;";

  mover(x: number, y: number): void {
    this.stylePosition = `left: ${x}px; top: ${y}px;`;
  }

  moverEsquerda() {
    this.a -= 30;
    if(this.a < 0) {
      this.a = 0;
    }
    this.mover(this.a, this.b);
  }

  moverDireita() {
    this.a += 30;
    if(this.a > 500) {
      this.a = 500-30;
    }
    this.mover(this.a, this.b);
  }

  moverCima() {
    this.b -= 30;
    if(this.b < 0) {
      this.b = 0;
    }
    this.mover(this.a, this.b);
  }

  moverBaixo() {
    this.b += 30;
    if(this.b > 500) {
      this.b = 500-30;
    }
    this.mover(this.a, this.b);
  }

  moverTeclado(evento: KeyboardEvent) {
    console.log(evento.key);
    switch(evento.key) {
      case "ArrowDown":
        this.moverBaixo();
        break;
      case "ArrowUp":
        this.moverCima();
        break;
      case "ArrowLeft":
        this.moverEsquerda();
        break;
      case "ArrowRight":
        this.moverDireita();
        break;
    }
  }
}
