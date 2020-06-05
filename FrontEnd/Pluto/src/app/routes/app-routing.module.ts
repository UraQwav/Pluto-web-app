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
import { ProfileSubscriptionManagerComponent } from '../components/for-profile-page/profile-subscription-manager/profile-subscription-manager.component';
import { CompanyPageComponent } from '../pages/company-page/company-page.component';
import { CompanyServicePageComponent } from '../pages/company-service-page/company-service-page.component';
import { PopularSubsPageComponent } from '../pages/popular-subs-page/popular-subs-page.component';
import { DeveloperPageComponent } from '../pages/developer-page/developer-page.component';
import { DeveloperCompaniComponent } from '../components/for-developer-page/developer-compani/developer-compani.component';
import { DeveloperSubsComponent } from '../components/for-developer-page/developer-subs/developer-subs.component';
import { DeveloperProfilesComponent } from '../components/for-developer-page/developer-profiles/developer-profiles.component';
import { PopularSubMoreComponent } from '../components/for-popular-page/popular-sub-more/popular-sub-more.component';


const routes: Routes = [
  { path: '', component: HomePageComponent },
  { path: 'sign', component: SignPageComponent },
  { path: 'popular-subs', component: PopularSubsPageComponent },
  { path: 'popular-sub-more/:id', component: PopularSubMoreComponent },
  { path: 'partnership', component: CompanyPageComponent },
  { path: 'partnership/create-service', component: CompanyServicePageComponent },
  { path: 'my-profile', component: ProfilePageComponent, children: [ 
    {path: '', redirectTo: '/my-profile/home/', pathMatch: 'full'} ,
    {path: 'home/:id', component: ProfileHomeComponent},
    {path: 'subscriptions/:id/manager/:id', component: ProfileSubscriptionManagerComponent},
    {path: 'subscriptions/:id', component: ProfileSubscriptionsComponent},
    {path: 'notifications/:id', component: ProfileNotificationsComponent},
    {path: 'calendar/:id', component: ProfileCalendarComponent},
    {path: 'settings/:id', component: ProfileSettingsComponent}
  ]},
  { path: 'developer', component: DeveloperPageComponent, children: [ 
    {path: '', redirectTo: '/developer/vereficationC/', pathMatch: 'full'} ,
    {path: 'vereficationC/:id', component: DeveloperCompaniComponent},
    {path: 'vereficationS/:id', component: DeveloperSubsComponent},
    {path: 'profiles/:id', component: DeveloperProfilesComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
