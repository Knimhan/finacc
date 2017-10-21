import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { UserComponent} from './components/user/user.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'klt/users',
    pathMatch: 'full'
  },
  {
    path: 'klt/users',
    component: UserComponent
  },
  {
    path: '**',
    component: UserComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
