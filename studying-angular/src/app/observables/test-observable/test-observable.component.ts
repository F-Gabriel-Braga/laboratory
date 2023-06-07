import { Component, OnInit } from '@angular/core';
import { catchError, debounceTime, filter, first, last, map, Observable, Observer, Subject, take, takeWhile, throwError, timeout } from 'rxjs';

@Component({
  selector: 'app-test-observable',
  templateUrl: './test-observable.component.html',
  styleUrls: ['./test-observable.component.css']
})
export class TestObservableComponent implements OnInit {

  constructor() { }

  nomes: string[] = [];
  nomes2: string[] = [];

  private backEndDados: string[] = ["Gabriel Braga", "João", "Aecio", "Brenda"];

  /*obs: Observable<string[]> = new Observable<string[]>((observer: Observer<string[]>) => {
    try {
      observer.next(this.backEndDados);
    }
    catch(e: any) {
      observer.error("Não foi!");
    }
    observer.complete();
  });*/

  // Cold Observable -> Observable (para cada consumidor tem um produtor)
  // Hot Observable -> Subject (para todos os consumidores tem um único produtor)

  // ReplaySubject -> Retorna os dados perdidos durante a execução do Observable
  // AnsyncSubject -> Retorna o primeiro dado passado
  // BehaviorSubject -> Obriga a iniciar um valor.

  sub: Subject<string[]> = new Subject<string[]>();

  aplicarDados(): void {
    setTimeout(() => {
      this.sub.next(this.backEndDados);
      this.sub.next(["Vanessa", "Icoma", "Luis", "Nico", "Ricardo"]);
      this.sub.complete();
    }, 3000)
  }

  ngOnInit(): void {
    this.sub.pipe(
    /*map(
      (vetor: string[]) => {
        // Alterar texto do vetor para caixa alta aplicando a função de uppercase
        let result: string[] = [];
        for(let dado of vetor) {
          result.push(dado.toUpperCase())
        }
        return result;
      }
    ),
    filter(
      (vetor: string[]) => {
        return vetor.length == 3;
      }
    ),
    take(0),
    first(),
    last(),
    takeWhile((vetor: string[]) => {
      return vetor.length <= 5;
    })
    debounceTime(6000)*/
    timeout(2000),
    catchError(error => {
      return throwError("Tempo de carregamento estourado!");
    })
    ).subscribe({
      next: (dados: string[]) => {
        // Consumo de dados
        this.nomes = dados;
        console.log();
      },
      error: error => {
        // Notificação de Erro
        console.error(error);
      },
      complete: () => {
        // Notificação de finalização
        console.log("Completo.");
      }
    });

    this.sub.subscribe({
      next: (dados: string[]) => {
        this.nomes2 = dados;
      }
    });

    this.aplicarDados();
  }
}