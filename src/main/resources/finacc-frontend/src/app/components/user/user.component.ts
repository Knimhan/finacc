import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user.service';
import { User } from '../../dtos/user';
import { Router} from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html'
})
export class UserComponent implements OnInit {

  public users: User[];

  constructor(
    private router: Router,
    private userService: UserService) { }

  ngOnInit() {
    this.findAll();
  }

  private findAll(){
    this.userService.findAll().subscribe(
      data => {
        this.users = data;
      },
      error => {
        this.handleError(error);
      });
  }

  private handleError(error: Response | any) {
    let errorBody = error.json();
    let message = 'Unknown exception occurred';
    if (errorBody.message) {
      message = errorBody.message;
    }
  }

}
