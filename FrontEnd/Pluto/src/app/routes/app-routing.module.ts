import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from '../pages/home-page/home-page.component';
import { SignPageComponent } from '../pages/sign-page/sign-page.component'
import { ProfilePageComponent } from '../pages/profile-page/profile-page.component'

const routes: Routes = [
  { path: '', component: HomePageComponent },
  { path: 'sign', component: SignPageComponent },
  { path: 'my-profile', component: ProfilePageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
