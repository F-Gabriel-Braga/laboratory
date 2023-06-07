import { Component } from '@angular/core';

@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent {

  constructor() { }

  public set(value: string) {
    let terminal: HTMLSelectElement = <HTMLSelectElement>document.getElementById("result");
    terminal.value += value;
  }

  public clear() {
    let terminal: HTMLSelectElement = <HTMLSelectElement>document.getElementById("result");
    terminal.value = "";
  }

  public backspace() {
    let terminal: HTMLSelectElement = <HTMLSelectElement>document.getElementById("result");
    let expression: string = terminal.value;
    if(!(expression.length == 0)) {
      terminal.value = expression.slice(0, -1);
    }
  }

  public calc() {
    let terminal: HTMLSelectElement = <HTMLSelectElement>document.getElementById("result");
    let expression: string = terminal.value;
    if(!(expression.length == 0)) {
      terminal.value = eval(expression);
    }
  }
}
