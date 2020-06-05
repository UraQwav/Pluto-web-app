import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeveloperPageUserComponent } from './developer-page-user.component';

describe('DeveloperPageUserComponent', () => {
  let component: DeveloperPageUserComponent;
  let fixture: ComponentFixture<DeveloperPageUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeveloperPageUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeveloperPageUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
