import { Component } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user-service';

@Component({
  selector: 'new-user',
  templateUrl: './new-user.component.html',
  styleUrls: ['./new-user.component.css']
})
export class NewUserComponent {

  constructor() { }

  public listUsers: User[] = UserService.findAll();

  public listEmpty: boolean = this.listUsers.length == 0;

  public add(user: string, name: string, password: string, job: string, address: string, email: string,  image: string, administrator: boolean): void {
    UserService.addUser({
      username: user,
      name: name,
      password: password,
      job: job, 
      address: address,
      email: email, 
      image: image,
      administrator: administrator
    });
  }
}
