import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-titulo',
  templateUrl: './titulo.component.html',
  styleUrls: ['./titulo.component.css']
})
export class TituloComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public titulo: string = "Componente auxiliar"
  public alterarTexto(titulo: string) {
    this.titulo = titulo;
  }

}
