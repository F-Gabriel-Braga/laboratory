import { Component } from '@angular/core';

type Pessoa = {
  nome: string,
  idade: number,
  curso: string
}

@Component({
  selector: 'app-lista-alunos',
  templateUrl: './lista-alunos.component.html',
  styleUrls: ['./lista-alunos.component.css']
})
export class ListaAlunosComponent {

  constructor() { }

  lista: Pessoa[] = [
    {
      nome: "Marina",
      idade: 22,
      curso: "HTML/CSS"
    },
    {
      nome: "João",
      idade: 27,
      curso: "Angular"
    },
    {
      nome: "Tatiane",
      idade: 25,
      curso: "Java"
    },
    {
      nome: "Luis",
      idade: 26,
      curso: "HTML/CSS"
    }
  ];

  public adicionarAluno(nome: string, idade: string, curso: string): void {
    this.lista.push({
      nome: nome,
      idade: parseInt(idade),
      curso: curso
    });
  }
}
