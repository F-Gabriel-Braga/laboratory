import { Component, EventEmitter, Input, Output } from '@angular/core';
import { User } from '../model/user';

@Component({
  selector: 'personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent {

  constructor() { }

  @Input()
  public user: User | null = null;

  @Output()
  logout: EventEmitter<any> = new EventEmitter();

  public exit(): void {
    this.logout.emit();
  }
}
