import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileSubscriptionManagerComponent } from './profile-subscription-manager.component';

describe('ProfileSubscriptionManagerComponent', () => {
  let component: ProfileSubscriptionManagerComponent;
  let fixture: ComponentFixture<ProfileSubscriptionManagerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfileSubscriptionManagerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfileSubscriptionManagerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
