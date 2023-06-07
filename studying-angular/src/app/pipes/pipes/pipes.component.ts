import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  music: any = {
    name: "Paradise",
    author: "Coldplay",
    view: 1.591935650,
    lancamento: new Date(2011, 9, 19)
  }
}
