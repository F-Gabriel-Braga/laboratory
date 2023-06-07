import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'camelCase'
})
export class CamelCasePipe implements PipeTransform {

  transform(value: string): string {
    let result: string = "";
    let palavras: string[] = value.split(" ");
    for(let palavra of palavras) {
      result += palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase() + " ";
    }
    return result;
  }
}
