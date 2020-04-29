import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './routes/app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomePageComponent } from './pages/home-page/home-page.component';
import { SignPageComponent } from './pages/sign-page/sign-page.component';
import { ProfilePageComponent } from './pages/profile-page/profile-page.component';
import { HomePageMainAnimationComponent } from './components/for-home-page/home-page-main-animation/home-page-main-animation.component';
import { SignPageDescriptionComponent } from './components/for-sign-page/sign-page-description/sign-page-description.component';
import { SignInFormComponent } from './components/for-sign-page/sign-in-form/sign-in-form.component';
import { SignUpFormComponent } from './components/for-sign-page/sign-up-form/sign-up-form.component';
import { SubscriptionsPraysComponent } from './components/for-home-page/subscriptions-prays/subscriptions-prays.component';
import { ProfileMenuComponent } from './components/for-profile-page/profile-menu/profile-menu.component';
import { ProfileSubscriptionComponent } from './components/for-profile-page/profile-subscription/profile-subscription.component';
import { ProfileCardComponent } from './components/for-profile-page/profile-card/profile-card.component';
import { ProfileHomeComponent } from './components/for-profile-page/profile-home/profile-home.component';
import { ProfileNotificationsComponent } from './components/for-profile-page/profile-notifications/profile-notifications.component';
import { ProfileSettingsComponent } from './components/for-profile-page/profile-settings/profile-settings.component';
import { ProfileCalendarComponent } from './components/for-profile-page/profile-calendar/profile-calendar.component';
import { ProfileSubscriptionsComponent } from './components/for-profile-page/profile-subscriptions/profile-subscriptions.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomePageComponent,
    SignPageComponent,
    ProfilePageComponent,
    HomePageMainAnimationComponent,
    SignPageDescriptionComponent,
    SignInFormComponent,
    SignUpFormComponent,
    SubscriptionsPraysComponent,
    ProfileMenuComponent,
    ProfileSubscriptionComponent,
    ProfileCardComponent,
    ProfileHomeComponent,
    ProfileNotificationsComponent,
    ProfileSettingsComponent,
    ProfileCalendarComponent,
    ProfileSubscriptionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
