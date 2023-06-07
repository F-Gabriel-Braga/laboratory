import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor() { }

  @Output()
  login: EventEmitter<User> = new EventEmitter();

  public logar(name: string, password: string) {
    let user: User | null = UserService.findUser(name, password);
    if(user == null) {
      window.alert("Usuário e/ou senha incorreto!");
    }
    else {
      this.login.emit(user);
    }
  }
}
