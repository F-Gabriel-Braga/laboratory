import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Film } from '../film';
import { FilmService } from '../film.service';

@Component({
  selector: 'app-films',
  templateUrl: './films.component.html',
  styleUrls: ['./films.component.css']
})
export class FilmsComponent implements OnInit {

  films: Film[] = [];
  service: FilmService;
  form: FormGroup;
  formEdit: FormGroup;

  constructor(service: FilmService, formBuilder: FormBuilder) {
    this.service = service;

    this.form = formBuilder.group({
      name: formBuilder.control(''),
      category: formBuilder.control(''),
      year: formBuilder.control(''),
    })

    this.formEdit = formBuilder.group({
      id: formBuilder.control(''),
      name: formBuilder.control(''),
      category: formBuilder.control(''),
      year: formBuilder.control(''),
    })
  }

  ngOnInit(): void {
    this.initConsume();
  }

  initConsume(): void {
    this.service.findAll().subscribe((films: Film[]) => {
      this.films = films;
    });
  }

  cadastrar(): void {
    this.service.insert(this.form.value).subscribe(res => res);
    this.initConsume();
  }

  editar(): void {
    this.service.update(this.formEdit.value).subscribe(res => res);
    this.initConsume();
  }

  excluirIten(id: number): void {
    this.service.delete(id).subscribe(res => res);
  }
}
