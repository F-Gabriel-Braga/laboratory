import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-data-driven',
  templateUrl: './data-driven.component.html',
  styleUrls: ['./data-driven.component.css']
})
export class DataDrivenComponent implements OnInit {

  formulario: FormGroup;
  descriptions: FormArray;
  formBuilder: FormBuilder;

  constructor(formBuilder: FormBuilder) {
    this.formBuilder = formBuilder;

    this.formulario = formBuilder.group({
      descriptions: formBuilder.array([
        ['', [Validators.required]]
      ]),
      client: ['', [Validators.required]],
      total: ['', [Validators.required, Validators.min(0)]]
    });

    /*this.formulario = new FormGroup({
      descriptions: new FormControl('', [Validators.required]),
      client: new FormControl('', [Validators.required]),
      total: new FormControl('', [Validators.required, Validators.min(0)])
    });*/
    this.descriptions = <FormArray>this.formulario.get('descriptions');
  }

  ngOnInit(): void {
  }

  onSubmit(): void {
    console.log(this.formulario.value);
  }

  onReset(): void {
    this.formulario.reset();
  }

  aplicaCssError(campo: string): any {
    return {
      'error': (this.formulario.get(campo)?.invalid && this.formulario.get(campo)?.touched)
    }
  }

  addItem(): void {
    this.descriptions.push(new FormControl('', [Validators.required]));
    this.formulario.controls['descriptions'] = this.descriptions;
  }

}
