import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { SignUpPageComponent } from './sign-up-page/sign-up-page.component'
import { ProfilePageComponent } from './profile-page/profile-page.component'

const routes: Routes = [
  { path: '', component: HomePageComponent },
  { path: 'Sign-Up', component: SignUpPageComponent },
  { path: 'My-profile', component: ProfilePageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
