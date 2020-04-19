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
    ProfileSubscriptionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
