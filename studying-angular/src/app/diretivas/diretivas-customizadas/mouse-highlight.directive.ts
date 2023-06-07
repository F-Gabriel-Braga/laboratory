import { Directive, ElementRef, HostListener, Input, Renderer2 } from '@angular/core';

// A documentação é a melhor amiga do dev!
// element-name: Selecione pelo nome do elemento.
// .class: Selecione pelo nome da classe.
// [attribute]: Selecione pelo nome do atributo.
// [attribute=value]: Selecione pelo nome e valor do atributo.
// :not(sub_selector): Selecione apenas se o elemento não corresponder ao sub_selector.
// selector1, selector2: Selecione se selector1ou selector2 corresponde.
// https://angular.io/api/core/Directive

@Directive({
  selector: '[highlight]'
})
export class MouseHighlightDirective {

  public elemento: ElementRef; // Faz referência ao elemento anotado com a diretiva.
  public renderer: Renderer2;  // Efetua modificações nos elementos. 

  @Input('highlight')
  public highlightColor: string = "yellow";

  @HostListener('mouseenter')
  public mouseOn(): void {
    this.renderer.setStyle(this.elemento.nativeElement, 'background-color', this.highlightColor);
  }

  @HostListener('mouseout')
  public mouseOff(): void {
    this.renderer.setStyle(this.elemento.nativeElement, 'background-color', 'white');
  }

  constructor(elemento: ElementRef, renderer: Renderer2) {
    this.elemento = elemento;
    this.renderer = renderer;
  }

}
