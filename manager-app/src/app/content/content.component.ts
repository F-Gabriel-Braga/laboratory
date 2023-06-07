import { Component, EventEmitter } from '@angular/core';
import { User } from '../model/user';

@Component({
  selector: 'content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css']
})
export class ContentComponent {

  constructor() { }

  public user: User | null = null;

  public userEmpty: boolean = this.user == null;

  public init(user: User): void {
    this.user = user;
    this.userEmpty = false;
  }

  public finish(): void {
    this.user = null;
    this.userEmpty = true;
  }
}
