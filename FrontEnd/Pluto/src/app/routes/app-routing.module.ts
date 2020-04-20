import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomePageComponent } from '../pages/home-page/home-page.component';
import { SignPageComponent } from '../pages/sign-page/sign-page.component';
import { ProfilePageComponent } from '../pages/profile-page/profile-page.component';
import { ProfileSubscriptionsComponent } from '../components/for-profile-page/profile-subscriptions/profile-subscriptions.component';
import { ProfileHomeComponent } from '../components/for-profile-page/profile-home/profile-home.component';
import { ProfileNotificationsComponent } from '../components/for-profile-page/profile-notifications/profile-notifications.component';
import { ProfileCalendarComponent } from '../components/for-profile-page/profile-calendar/profile-calendar.component';
import { ProfileSettingsComponent } from '../components/for-profile-page/profile-settings/profile-settings.component';


const routes: Routes = [
  { path: '', component: HomePageComponent },
  { path: 'sign', component: SignPageComponent },
  { path: 'my-profile', component: ProfilePageComponent, children: [ 
    {path: '', component: ProfileHomeComponent} ,
    {path: 'home', component: ProfileHomeComponent},
    {path: 'subscriptions', component: ProfileSubscriptionsComponent},
    {path: 'notifications', component: ProfileNotificationsComponent},
    {path: 'calendar', component: ProfileCalendarComponent},
    {path: 'settings', component: ProfileSettingsComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
