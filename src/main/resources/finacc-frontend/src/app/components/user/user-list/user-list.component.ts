import { Component, OnInit, Input} from '@angular/core';
import { UserService } from '../../../services/user.service';
import { User } from '../../../dtos/user';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html'
})
export class UserListComponent implements OnInit {

  @Input()
  public users: User[];

  constructor(
    private userService: UserService
  ) { }

  ngOnInit() {
  }

  public delete(id: number) {
    this.userService.delete(id).subscribe(data => window.location.reload());
  }

}
