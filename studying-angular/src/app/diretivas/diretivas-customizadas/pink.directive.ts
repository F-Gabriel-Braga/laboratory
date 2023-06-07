import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[pink]'
})
export class PinkDirective {

  constructor(elemento: ElementRef, renderer: Renderer2) {
    renderer.setStyle(elemento.nativeElement, 'background-color', 'pink');
  }
}
