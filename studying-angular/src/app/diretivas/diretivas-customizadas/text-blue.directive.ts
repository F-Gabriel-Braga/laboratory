import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: 'h3[textBlue]'
})
export class TextBlueDirective {

  constructor(elemento: ElementRef) {
    elemento.nativeElement.style.textAlign = "center";
    elemento.nativeElement.style.backgroundColor = "blue";
    elemento.nativeElement.style.color = "white";
  }
}
