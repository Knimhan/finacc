import { Component, OnInit } from '@angular/core';
import { UserService } from '../../../services/user.service';
import { User } from '../../../dtos/user';

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html'
})
export class UserAddComponent implements OnInit {

  public firstName: string;
  public lastName: string;
  public ageStatus: string;
  public age: number;
  public disabledSubmit: boolean = true;

  constructor(
    private userService: UserService
  ) { }

  ngOnInit() {
  }

  public save() {
    this.disabledSubmit = true; this.ageStatus = "";
    let user = new User();
    user.firstName = this.firstName;
    user.lastName = this.lastName;
    user.age = this.age;
    this.userService.save(user).subscribe(data => window.location.reload());
  }

  public validateAge(age: number) {
    this.userService.validateAge(age).subscribe(data => {
      this.ageStatus = data;
      if (this.ageStatus == 'OK' || this.ageStatus === 'funny') {
        this.disabledSubmit = false;
      } else {
        this.disabledSubmit = true;
      }
    });
  }


  public clear() {
    window.location.reload();
  }

}
