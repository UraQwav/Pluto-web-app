import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { SignUpPageComponent} from './sign-up-page/sign-up-page.component'

const routes: Routes = [
  { path: '', component: HomePageComponent },
  { path: 'Sign-Up', component: SignUpPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
