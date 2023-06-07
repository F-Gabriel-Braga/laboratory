import { Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-auxiliar',
  templateUrl: './auxiliar.component.html',
  styleUrls: ['./auxiliar.component.css']
})
export class AuxiliarComponent implements OnInit, OnChanges, DoCheck, OnDestroy {


  @Input()
  public valor: number = 5;
  
  constructor() {
    console.log("Contructor!");
  }
  
  ngOnChanges(changes: SimpleChanges): void {
    console.log("ngOnChanges: Entrada de dados!");
    //console.log("Anterior: " + changes["valor"].previousValue);
    //console.log("Atual: " + changes["valor"].currentValue);
    //console.log("Atual é o primeiro?: " + changes["valor"].isFirstChange());
  }

  ngOnInit(): void {
    console.log("ngOnInit: Componente inciado!");
  }

  ngDoCheck(): void {
    console.log("ngDoCheck: Componente alterado!");
  }
  
  ngOnDestroy(): void {
    console.log("ngOnDestroy: Componente foi destruido!");
  }
}
