import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'arraySum'
})
export class ArraySumPipe implements PipeTransform {

  transform(value: number[]): number {
    let result: number = 0;
    for(let numero of value) {
      result += numero;
    }
    return result;
  }
}
