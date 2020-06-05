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
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProfileSubscriptionManagerComponent } from './components/for-profile-page/profile-subscription-manager/profile-subscription-manager.component';
import { CompaniesAddComponent } from './components/for-companies-page/companies-add/companies-add.component';
import { CompaniesAddServicesComponent } from './components/for-companies-page/companies-add-services/companies-add-services.component';
import { CompanyPageComponent } from './pages/company-page/company-page.component';
import { CompanyPageDescriptionComponent } from './components/for-companies-page/company-page-description/company-page-description.component';
import { CompanyServicePageDescriptionComponent } from './components/for-companies-page/company-service-page-description/company-service-page-description.component';
import { CompanyServicePageComponent } from './pages/company-service-page/company-service-page.component';
import { PopularSubsPageComponent } from './pages/popular-subs-page/popular-subs-page.component';
import { PopularSubsComponent } from './components/for-popular-page/popular-subs/popular-subs.component';
import { PopularSubMoreComponent } from './components/for-popular-page/popular-sub-more/popular-sub-more.component';
import { AdminPageUsersComponent } from './pages/admin-page-users/admin-page-users.component';
import { DeveloperPageComponent } from './pages/developer-page/developer-page.component';
import { DeveloperMenuComponent } from './components/for-developer-page/developer-menu/developer-menu.component';
import { DeveloperProfilesComponent } from './components/for-developer-page/developer-profiles/developer-profiles.component';
import { DeveloperCompaniComponent } from './components/for-developer-page/developer-compani/developer-compani.component';
import { DeveloperSubsComponent } from './components/for-developer-page/developer-subs/developer-subs.component';
import { DeveloperPageUserComponent } from './pages/developer-page-user/developer-page-user.component';
import { DeveloperPageCComponent } from './pages/developer-page-c/developer-page-c.component';
import { DeveloperPageSComponent } from './pages/developer-page-s/developer-page-s.component'

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
    ProfileSubscriptionsComponent,
    ProfileSubscriptionManagerComponent,
    CompaniesAddComponent,
    CompaniesAddServicesComponent,
    CompanyPageComponent,
    CompanyPageDescriptionComponent,
    CompanyServicePageDescriptionComponent,
    CompanyServicePageComponent,
    PopularSubsPageComponent,
    PopularSubsComponent,
    PopularSubMoreComponent,
    AdminPageUsersComponent,
    DeveloperPageComponent,
    DeveloperMenuComponent,
    DeveloperProfilesComponent,
    DeveloperCompaniComponent,
    DeveloperSubsComponent,
    DeveloperPageUserComponent,
    DeveloperPageCComponent,
    DeveloperPageSComponent
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
