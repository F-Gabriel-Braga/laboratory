import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TestObservableComponent } from './test-observable/test-observable.component';



@NgModule({
  declarations: [
    TestObservableComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    TestObservableComponent
  ]
})
export class ObservablesModule { }
