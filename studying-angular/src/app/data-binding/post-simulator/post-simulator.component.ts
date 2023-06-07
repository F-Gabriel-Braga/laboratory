import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-post-simulator',
  templateUrl: './post-simulator.component.html',
  styleUrls: ['./post-simulator.component.css']
})
export class PostSimulatorComponent {

  constructor() { }

  autor!: string;
  legenda!: string;
  imagem!: string;

}
