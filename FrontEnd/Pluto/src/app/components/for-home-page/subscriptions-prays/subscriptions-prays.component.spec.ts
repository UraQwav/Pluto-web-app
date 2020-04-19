import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SubscriptionsPraysComponent } from './subscriptions-prays.component';

describe('SubscriptionsPraysComponent', () => {
  let component: SubscriptionsPraysComponent;
  let fixture: ComponentFixture<SubscriptionsPraysComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SubscriptionsPraysComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SubscriptionsPraysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
