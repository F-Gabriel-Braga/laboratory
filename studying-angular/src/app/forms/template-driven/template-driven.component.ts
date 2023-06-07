import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Hero } from './model/hero';

@Component({
  selector: 'app-template-driven',
  templateUrl: './template-driven.component.html',
  styleUrls: ['./template-driven.component.css']
})
export class TemplateDrivenComponent implements OnInit {

  http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  ngOnInit(): void {
  }

  hero: Hero = new Hero();

  onSubmit(form: NgForm): void {
    this.hero = form.value;
    //this.http.post("/back-end", JSON.stringify(this.hero));
  }
}
