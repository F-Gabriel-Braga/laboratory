import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component } from '@angular/core';

@Component({
  selector: 'app-ciclo-de-vida',
  templateUrl: './ciclo-de-vida.component.html',
  styleUrls: ['./ciclo-de-vida.component.css']
})
export class CicloDeVidaComponent implements AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked {

  constructor() { }

  public n: number = 10;
  public acrecentar(): void {
    this.n++;
  }

  public texto: string = "";
  public alterarTexto(texto: string) {
    this.texto = texto;
  }

  public mostrar: boolean = true;
  public alterarContainer() {
    this.mostrar = !this.mostrar;
  }

  ngAfterContentInit(): void {
    console.log("ngAfterContentInit: O tiulo foi iniciado.");
  }
  
  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked: O tiulo foi alterado.");
  }
  
  ngAfterViewInit(): void {
    console.log("ngAfterViewInit: A pagina foi renderizada!");
  }
  
  ngAfterViewChecked(): void {
    console.log("ngAfterViewCheck: A pagina foi alterada!");
  }
}
